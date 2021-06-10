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
    private final SecurityServiceImpl securityService;
    private final UserServiceImpl userService;

    @GetMapping("/random")
    public String getRandomDrink(Model model){
        model.addAttribute("drink", drinkService.getRandomDrink().get(0));
        return "/randomDrink";
    }

    @PostMapping("/random")
    public String addFavoriteDrink(@RequestParam String strDrink, String strAlcoholic,
                                   String strIngredientsAndMeasures, String strInstructions) {
        Drink drink = new Drink();
        drink.setName(strDrink);
        drink.setAlcoholic(strAlcoholic);
        drink.setIngredientsAndMeasures(strIngredientsAndMeasures);
        drink.setInstructions(strInstructions);

        String username = securityService.findLoggedInUsername();

        User user = userService.findByUsername(username);

        user.getDrinks().add(drink);

        drinkService.addDrink(drink);

        return "/home";
    }

    @GetMapping("/byName")
    public String getDrinkByName(HttpServletRequest request, Model model) {
        model.addAttribute("drinks", drinkService.getDrinkByName(request.getParameter("drinkName")));
        return "/drinksByName";
    }

}
