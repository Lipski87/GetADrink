package pl.coderslab.GetADrink.web.service.drink;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.GetADrink.model.Drink;
import pl.coderslab.GetADrink.webclient.DrinkClient;

@Service
@RequiredArgsConstructor
public class DrinkService {

    private final DrinkClient drinkClient;

    public Drink getRandomDrink() {
        return drinkClient.getRandomDrink();
    }
}
