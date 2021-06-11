package pl.coderslab.GetADrink.web.service.drink;

import org.springframework.stereotype.Service;
import pl.coderslab.GetADrink.model.Drink;

@Service
public interface DrinkService {
    Drink findByDrinkName(String drinkName);
}
