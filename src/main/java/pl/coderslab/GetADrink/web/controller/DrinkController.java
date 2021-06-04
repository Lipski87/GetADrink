package pl.coderslab.GetADrink.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.GetADrink.model.Drink;
import pl.coderslab.GetADrink.web.service.drink.DrinkService;

@Controller
@RequestMapping("/drinks")
public class DrinkController {

    private final DrinkService drinkService;

    @Autowired
    public DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @GetMapping("/random")
    public String getRandomDrink(Model model){
        model.addAttribute("drinks", drinkService.getRandomDrink());
        return "/randomDrink";
    }

    @GetMapping("/drinkByName")
    public String getDrinkByName(Model model) {
        model.addAttribute("drinks", drinkService.getDrinkByName());
        return "/drinksByName";
    }

    @PostMapping("/add")
    public void addFavoriteDrink(Drink drink) {
        drinkService.addDrink(drink);
    }

}
