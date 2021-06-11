package pl.coderslab.GetADrink.web.service.drink;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.GetADrink.webclient.AlcoholClient;

@Service
@RequiredArgsConstructor
public class AlcoholService {

    private final AlcoholClient alcoholClient;

    public String getAlcoholDetails(String alcohol) {
        return alcoholClient.getAlcoholDetails(alcohol);
    }
}
