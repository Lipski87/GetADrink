package pl.coderslab.GetADrink.web.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.GetADrink.model.Drink;
import pl.coderslab.GetADrink.model.User;
import pl.coderslab.GetADrink.validation.UserValidator;
import pl.coderslab.GetADrink.web.service.drink.DrinkService;
import pl.coderslab.GetADrink.web.service.security.SecurityServiceImpl;
import pl.coderslab.GetADrink.web.service.user.UserServiceImpl;

import java.util.Set;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userServiceImpl;
    private final SecurityServiceImpl securityServiceImpl;
    private final UserValidator userValidator;


    @GetMapping("/registration")
    public String getRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "/userRegistrationForm";
    }

    @PostMapping("/registration")
    public String processRegistrationForm(@ModelAttribute("user") User user, BindingResult bindingResult){
        userValidator.validate(user, bindingResult);

        if (bindingResult.hasErrors()){
            return "/userRegistrationForm";
        }

        userServiceImpl.addUser(user);

        securityServiceImpl.autoLogin(user.getUsername(), user.getPasswordConfirm());
        return "redirect:/home";
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username or password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");
        return "/login";
    }

    @GetMapping("/")
    public String welcome(Model model) {

        String username = securityServiceImpl.findLoggedInUsername();

        User user = userServiceImpl.findByUsername(username);

        model.addAttribute("drinks", user.getDrinks());

        return "/home";
    }
}
