package pl.coderslab.GetADrink.thecocktailDB;

import lombok.RequiredArgsConstructor;
import org.springframework.web.client.RestTemplate;


@RequiredArgsConstructor
public class TheCocktailDbClient {

    private final RestTemplate restTemplate;


}
