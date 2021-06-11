package pl.coderslab.GetADrink.webclient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.coderslab.GetADrink.model.DrinkJsonProperty;
import pl.coderslab.GetADrink.webclient.dto.DrinkDto;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;


@Component
@RequiredArgsConstructor
public class DrinkClient {

    private final WebClient webClient;


    public List<DrinkJsonProperty> getRandomDrink() {

        DrinkDto drinkDto = webClient.callGetMethod("{apiKey}/random.php", DrinkDto.class, webClient.getAPI_KEY());

        return getDrinks(drinkDto);

    }

    public List<DrinkJsonProperty> getDrinkByName(String drinkName) {
        DrinkDto drinkDto = webClient.callGetMethod("{apikey}/search.php?s={drinkName}", DrinkDto.class,
                webClient.getAPI_KEY(), drinkName);
        return getDrinks(drinkDto);
    }

    public List<DrinkJsonProperty> getDrinkByIngredient(String ingredient) {
        DrinkDto drinkDto = webClient.callGetMethod("{apikey}/filter.php?i={ingredient}", DrinkDto.class,
                webClient.getAPI_KEY(), ingredient);
        return getDrinks(drinkDto);
    }


    private List<DrinkJsonProperty> getDrinks(DrinkDto drinkDto) {

        List<DrinkJsonProperty> drinkJsonProperties = new ArrayList<>();

        for (int i = 0; i < drinkDto.getDrinkJsonProperties().size(); i++) {

            drinkJsonProperties.add(DrinkJsonProperty.builder()
                    .strDrink(drinkDto.getDrinkJsonProperties().get(i).getStrDrink())
                    .strAlcoholic(drinkDto.getDrinkJsonProperties().get(i).getStrAlcoholic())
                    .strIngredientsAndMeasures(getIngredientsAndMeasures(drinkDto.getDrinkJsonProperties().get(i)))
                    .strInstructions(drinkDto.getDrinkJsonProperties().get(i).getStrInstructions())
                    .build());
        }
        return drinkJsonProperties;
    }

    private String getIngredientsAndMeasures(DrinkJsonProperty drinkJsonProperty) {

        List<Object> measures = asList(drinkJsonProperty.getStrMeasure1(),
                drinkJsonProperty.getStrMeasure2(),
                drinkJsonProperty.getStrMeasure3(),
                drinkJsonProperty.getStrMeasure4(),
                drinkJsonProperty.getStrMeasure5(),
                drinkJsonProperty.getStrMeasure6(),
                drinkJsonProperty.getStrMeasure7(),
                drinkJsonProperty.getStrMeasure8(),
                drinkJsonProperty.getStrMeasure9(),
                drinkJsonProperty.getStrMeasure10(),
                drinkJsonProperty.getStrMeasure11(),
                drinkJsonProperty.getStrMeasure12(),
                drinkJsonProperty.getStrMeasure13(),
                drinkJsonProperty.getStrMeasure14(),
                drinkJsonProperty.getStrMeasure15());


        List<Object> ingredients = asList(drinkJsonProperty.getStrIngredient1(),
                drinkJsonProperty.getStrIngredient2(),
                drinkJsonProperty.getStrIngredient3(),
                drinkJsonProperty.getStrIngredient4(),
                drinkJsonProperty.getStrIngredient5(),
                drinkJsonProperty.getStrIngredient6(),
                drinkJsonProperty.getStrIngredient7(),
                drinkJsonProperty.getStrIngredient8(),
                drinkJsonProperty.getStrIngredient9(),
                drinkJsonProperty.getStrIngredient10(),
                drinkJsonProperty.getStrIngredient11(),
                drinkJsonProperty.getStrIngredient12(),
                drinkJsonProperty.getStrIngredient13(),
                drinkJsonProperty.getStrIngredient14(),
                drinkJsonProperty.getStrIngredient15());


        StringBuilder ingredientsBuilder = new StringBuilder();

        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i) != null && measures.get(i) != null) {
                ingredientsBuilder.append(ingredients.get(i)).append(" (").append(measures.get(i)).append(")");

                if (i < ingredients.size() - 1) {
                    ingredientsBuilder.append(", ");
                }
            }
        }
        return ingredientsBuilder.toString();
    }
}
