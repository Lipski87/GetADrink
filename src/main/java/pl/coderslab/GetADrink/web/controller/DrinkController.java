package pl.coderslab.GetADrink.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.GetADrink.model.Drink;
import pl.coderslab.GetADrink.web.service.drink.DrinkService;

@Controller
public class DrinkController {

    private final DrinkService drinkService;

    @Autowired
    public DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @GetMapping("/random")
    @ResponseBody
    public Drink getRandomDrink(){
        return drinkService.getRandomDrink();
    }

}
