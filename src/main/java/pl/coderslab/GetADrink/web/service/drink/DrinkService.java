package pl.coderslab.GetADrink.web.service.drink;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.GetADrink.model.Drink;
import pl.coderslab.GetADrink.webclient.DrinkClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DrinkService {

    private final DrinkClient drinkClient;



    public List<Drink> getRandomDrink() {
        return drinkClient.getRandomDrink();
    }

    public List<Drink> getDrinkByName() {
        return drinkClient.getDrinkByName();
    }
}
