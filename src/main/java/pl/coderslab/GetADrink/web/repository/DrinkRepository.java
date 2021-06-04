package pl.coderslab.GetADrink.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.GetADrink.model.Drink;

public interface DrinkRepository extends JpaRepository <Drink, Long> {

}
