package pl.coderslab.GetADrink.web.service.drink;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.GetADrink.model.Drink;
import pl.coderslab.GetADrink.model.DrinkJsonProperty;
import pl.coderslab.GetADrink.model.User;
import pl.coderslab.GetADrink.web.repository.DrinkRepository;
import pl.coderslab.GetADrink.web.service.security.SecurityServiceImpl;
import pl.coderslab.GetADrink.web.service.user.UserServiceImpl;
import pl.coderslab.GetADrink.webclient.DrinkClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DrinkServiceImpl implements DrinkService{

    private final DrinkClient drinkClient;
    private final DrinkRepository drinkRepository;
    private final SecurityServiceImpl securityServiceImpl;
    private final UserServiceImpl userServiceImpl;


    public DrinkJsonProperty getRandomDrink() {
        return drinkClient.getRandomDrink();
    }

    public List<DrinkJsonProperty> getDrinkByName(String drinkName) {
        return drinkClient.getDrinkByName(drinkName);
    }

    public List<DrinkJsonProperty> getDrinkByIngredient(String ingredient) {
        return drinkClient.getDrinkByIngredient(ingredient);
    }

    public void addDrink(Drink drink) {
        drinkRepository.save(drink);
    }

    public Drink addNewDrink(String drinkName, String alcoholic, String ingredientsAndMeasures, String instructions) {

        Drink drink = new Drink();
        drink.setName(drinkName);
        drink.setAlcoholic(alcoholic);
        drink.setIngredientsAndMeasures(ingredientsAndMeasures);
        drink.setInstructions(instructions);

        addDrinkToCurrentUser(drink);

        return drink;
    }

    public void addDrinkToCurrentUser(Drink drink){

        String username = securityServiceImpl.findLoggedInUsername();

        User user = userServiceImpl.findByUsername(username);

        user.getDrinks().add(drink);
    }


    @Override
    public Drink findByDrinkName(String drinkName) {
        return drinkRepository.findDrinkByName(drinkName);
    }
}
