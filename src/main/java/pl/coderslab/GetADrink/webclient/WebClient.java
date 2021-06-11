package pl.coderslab.GetADrink.webclient;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Getter
@Component
public class WebClient {

    private final String DRINK_URL = "https://www.thecocktaildb.com/api/json/v1/";
    private final String API_KEY = "1";
    private final RestTemplate restTemplate = new RestTemplate();

    public  <T> T callGetMethod(String url, Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(DRINK_URL + url, responseType, objects);
    }

}
