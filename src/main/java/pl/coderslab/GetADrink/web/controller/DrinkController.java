package pl.coderslab.GetADrink.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.GetADrink.model.Drink;
import pl.coderslab.GetADrink.web.service.drink.DrinkServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
@RequestMapping("/drinks")
public class DrinkController {

    private final DrinkServiceImpl drinkServiceImpl;

    @GetMapping("/random")
    public String getRandomDrink(Model model) {
        model.addAttribute("drink", drinkServiceImpl.getRandomDrink());
        return "/randomDrink";
    }

    @PostMapping("/random")
    public String addFavouriteRandomDrink(@RequestParam String strDrink, String strAlcoholic,
                                          String strIngredientsAndMeasures, String strInstructions) {

        Drink drink = drinkServiceImpl.findByDrinkName(strDrink);

        if (drink != null) {

            drinkServiceImpl.addDrinkToCurrentUser(drink);

        } else {

            Drink newDrink = drinkServiceImpl.addNewDrink(strDrink, strAlcoholic, strIngredientsAndMeasures, strInstructions);

            drinkServiceImpl.addDrink(newDrink);
        }

        return "redirect:/";
    }

    @GetMapping("/byName")
    public String getDrinkByName(HttpServletRequest request, Model model) {
        model.addAttribute("drinks", drinkServiceImpl.getDrinkByName(request.getParameter("drinkName")));
        return "/drinksByName";
    }

    @PostMapping("/byName")
    public String addFavouriteDrinkByName(@ModelAttribute("drink") Drink drink) {


        if (drinkServiceImpl.findByDrinkName(drink.getName()) != null) {

            drinkServiceImpl.addDrinkToCurrentUser(drinkServiceImpl.findByDrinkName(drink.getName()));

        } else {

            Drink newDrink = drinkServiceImpl.addNewDrink(drink.getName(), drink.getAlcoholic(),
                    drink.getIngredientsAndMeasures(),
                    drink.getInstructions());
            drinkServiceImpl.addDrink(newDrink);
        }

        return "redirect:/";
    }

    @GetMapping("/byIngredient")
    public String getDrinkByIngredient(HttpServletRequest request, Model model) {
        model.addAttribute("drinks", drinkServiceImpl.getDrinkByIngredient(request.getParameter("ingredient")));
        return "/drinksByIngredient";
    }

}
