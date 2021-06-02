package pl.coderslab.GetADrink.webclient;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.coderslab.GetADrink.model.Drink;
import pl.coderslab.GetADrink.webclient.dto.DrinkDto;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;


@Component
public class DrinkClient {

    private static final String DRINK_URL = "https://www.thecocktaildb.com/api/json/v1/";
    private static final String API_KEY = "1";
    private final RestTemplate restTemplate = new RestTemplate();

    private <T> T callGetMethod(String url, Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(DRINK_URL + url, responseType, objects);
    }


    public List<Drink> getRandomDrink() {

        DrinkDto drinkDto = callGetMethod("{apiKey}/random.php", DrinkDto.class, API_KEY);

        return getDrinks(drinkDto);

    }

    public List<Drink> getDrinkByName(String drinkName){
        DrinkDto drinkDto = callGetMethod("{apikey}/search.php?s={drinkName}", DrinkDto.class, API_KEY, drinkName);

        return getDrinks(drinkDto);
    }

    private List<Drink> getDrinks(DrinkDto drinkDto) {

        List<Drink> drinks= new ArrayList<>();

        for (int i = 0; i < drinkDto.getDrinks().size(); i++){

            drinks.add(Drink.builder()
                    .strDrink(drinkDto.getDrinks().get(i).getStrDrink())
                    .strAlcoholic(drinkDto.getDrinks().get(i).getStrAlcoholic())
                    .strIngredientsAndMeasures(getIngredientsAndMeasures(drinkDto))
                    .strInstructions(drinkDto.getDrinks().get(i).getStrInstructions())
                    .build());
        }
        return drinks;
    }

    private String getIngredientsAndMeasures(DrinkDto drinkDto) {
        StringBuilder ingredientsBuilder = new StringBuilder();

        List<Object> measures = asList(drinkDto.getDrinks().get(0).getStrMeasure1(),
                drinkDto.getDrinks().get(0).getStrMeasure2(),
                drinkDto.getDrinks().get(0).getStrMeasure3(),
                drinkDto.getDrinks().get(0).getStrMeasure4(),
                drinkDto.getDrinks().get(0).getStrMeasure5(),
                drinkDto.getDrinks().get(0).getStrMeasure6(),
                drinkDto.getDrinks().get(0).getStrMeasure7(),
                drinkDto.getDrinks().get(0).getStrMeasure8(),
                drinkDto.getDrinks().get(0).getStrMeasure9(),
                drinkDto.getDrinks().get(0).getStrMeasure10(),
                drinkDto.getDrinks().get(0).getStrMeasure11(),
                drinkDto.getDrinks().get(0).getStrMeasure12(),
                drinkDto.getDrinks().get(0).getStrMeasure13(),
                drinkDto.getDrinks().get(0).getStrMeasure14(),
                drinkDto.getDrinks().get(0).getStrMeasure15());


        List<Object> ingredients = asList(drinkDto.getDrinks().get(0).getStrIngredient1(),
                drinkDto.getDrinks().get(0).getStrIngredient2(),
                drinkDto.getDrinks().get(0).getStrIngredient3(),
                drinkDto.getDrinks().get(0).getStrIngredient4(),
                drinkDto.getDrinks().get(0).getStrIngredient5(),
                drinkDto.getDrinks().get(0).getStrIngredient6(),
                drinkDto.getDrinks().get(0).getStrIngredient7(),
                drinkDto.getDrinks().get(0).getStrIngredient8(),
                drinkDto.getDrinks().get(0).getStrIngredient9(),
                drinkDto.getDrinks().get(0).getStrIngredient10(),
                drinkDto.getDrinks().get(0).getStrIngredient11(),
                drinkDto.getDrinks().get(0).getStrIngredient12(),
                drinkDto.getDrinks().get(0).getStrIngredient13(),
                drinkDto.getDrinks().get(0).getStrIngredient14(),
                drinkDto.getDrinks().get(0).getStrIngredient15());

        for (int i = 0; i < 15; i++) {
            if (ingredients.get(i) != null && measures.get(i) != null) {
                ingredientsBuilder.append(ingredients.get(i)).append(" (").append(measures.get(i)).append("), ");
            }
        }
        return ingredientsBuilder.toString();
    }

}
