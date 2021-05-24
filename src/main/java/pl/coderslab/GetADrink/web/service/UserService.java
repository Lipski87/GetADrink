package pl.coderslab.GetADrink.web.service;

import pl.coderslab.GetADrink.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findByUserId(Long id);
    void addUser(User user);
}
