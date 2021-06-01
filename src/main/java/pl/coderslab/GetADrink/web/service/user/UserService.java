package pl.coderslab.GetADrink.web.service.user;

import org.springframework.stereotype.Service;
import pl.coderslab.GetADrink.model.User;

@Service
public interface UserService {

    User findByUsername(String username);
    void addUser(User user);
}
