package pl.coderslab.GetADrink.webclient;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.coderslab.GetADrink.model.Drink;
import pl.coderslab.GetADrink.webclient.dto.DrinkDto;


@Component
public class DrinkClient {

    private static final String DRINK_URL = "https://www.thecocktaildb.com/api/json/v1/";
    private static final String API_KEY = "1";
    private final RestTemplate restTemplate = new RestTemplate();

    private <T> T callGetMethod(String url, Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(DRINK_URL + url, responseType, objects);
    }


    public Drink getRandomDrink() {
        DrinkDto drinkDto = callGetMethod ("{apiKey}/random.php", DrinkDto.class, API_KEY);
        return Drink.builder()
                .strDrink(drinkDto.getDrinks().get(0).strDrink)
                .strAlcoholic(drinkDto.getDrinks().get(0).strAlcoholic)
                .strInstructions(drinkDto.getDrinks().get(0).strInstructions)
                .build();
    }
}
