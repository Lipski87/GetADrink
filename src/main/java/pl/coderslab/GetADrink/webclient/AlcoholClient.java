package pl.coderslab.GetADrink.webclient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.coderslab.GetADrink.model.AlcoholJsonProperty;
import pl.coderslab.GetADrink.webclient.dto.AlcoholDto;


@Component
@RequiredArgsConstructor
public class AlcoholClient {

    private final WebClient webClient;

    public String getAlcoholDetails(String alcohol) {
        AlcoholDto alcoholDto = webClient.callGetMethod("{apikey}/search.php?i={alcohol}", AlcoholDto.class,
                webClient.getAPI_KEY(), alcohol);
        return getDetails(alcoholDto.getAlcoholJsonProperties().get(0));
    }

    private String getDetails(AlcoholJsonProperty alcoholJsonProperty) {
        return alcoholJsonProperty.getStrDescription();
    }
}
