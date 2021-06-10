package pl.coderslab.GetADrink.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.GetADrink.model.Drink;
import pl.coderslab.GetADrink.model.User;
import pl.coderslab.GetADrink.web.service.drink.DrinkService;
import pl.coderslab.GetADrink.web.service.security.SecurityServiceImpl;
import pl.coderslab.GetADrink.web.service.user.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
@RequestMapping("/drinks")
public class DrinkController {

    private final DrinkService drinkService;

    @GetMapping("/random")
    public String getRandomDrink(Model model){
        model.addAttribute("drink", drinkService.getRandomDrink().get(0));
        return "/randomDrink";
    }

    @PostMapping("/random")
    public String addFavouriteRandomDrink(@RequestParam String strDrink, String strAlcoholic,
                                          String strIngredientsAndMeasures, String strInstructions) {

        Drink drink = drinkService.getDrink(strDrink, strAlcoholic, strIngredientsAndMeasures, strInstructions);

        drinkService.addDrink(drink);

        return "/home";
    }

    @GetMapping("/byName")
    public String getDrinkByName(HttpServletRequest request, Model model) {
        model.addAttribute("drinks", drinkService.getDrinkByName(request.getParameter("drinkName")));
        return "/drinksByName";
    }

    @PostMapping("/byName")
    public String addFavouriteDrinkByName(@ModelAttribute("drink") Drink drink) {

        Drink newDrink = drinkService.getDrink(drink.getName(),drink.getAlcoholic(),drink.getIngredientsAndMeasures()
                ,drink.getInstructions());

        drinkService.addDrink(newDrink);

        return "/home";
    }

    @GetMapping("/byIngredient")
    public String getDrinkByIngredient(HttpServletRequest request, Model model) {
        model.addAttribute("drinks", drinkService.getDrinkByIngredient(request.getParameter("ingredient")));
        return "/drinksByIngredient";
    }



}
