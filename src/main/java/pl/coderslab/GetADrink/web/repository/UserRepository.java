package pl.coderslab.GetADrink.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.GetADrink.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
