package pl.coderslab.GetADrink.web.service.drink;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.GetADrink.model.Drink;
import pl.coderslab.GetADrink.model.DrinkJsonProperty;
import pl.coderslab.GetADrink.web.repository.DrinkRepository;
import pl.coderslab.GetADrink.webclient.DrinkClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DrinkService {

    private final DrinkClient drinkClient;
    private final DrinkRepository drinkRepository;



    public List<DrinkJsonProperty> getRandomDrink() {
        return drinkClient.getRandomDrink();
    }

    public List<DrinkJsonProperty> getDrinkByName(String drinkName) {
        return drinkClient.getDrinkByName(drinkName);
    }

    public void addDrink(Drink drink) {
        drinkRepository.save(drink);
    }


}
