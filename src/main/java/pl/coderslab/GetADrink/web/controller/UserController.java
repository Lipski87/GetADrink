package pl.coderslab.GetADrink.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.GetADrink.model.User;
import pl.coderslab.GetADrink.validation.UserValidator;
import pl.coderslab.GetADrink.web.service.SecurityServiceImpl;
import pl.coderslab.GetADrink.web.service.UserServiceImpl;

@Controller
public class UserController {

    private final UserServiceImpl userServiceImpl;
    private final SecurityServiceImpl securityServiceImpl;
    private final UserValidator userValidator;

    public UserController(UserServiceImpl userServiceImpl, SecurityServiceImpl securityServiceImpl, UserValidator userValidator) {
        this.userServiceImpl = userServiceImpl;
        this.securityServiceImpl = securityServiceImpl;
        this.userValidator = userValidator;
    }

    @GetMapping("/registration")
    public String getRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "user/userRegistrationForm";
    }

    @PostMapping("/registration")
    public String processRegistrationForm(@ModelAttribute("user") User user, BindingResult bindingResult){
        userValidator.validate(user, bindingResult);

        if (bindingResult.hasErrors()){
            return "user/userRegistrationForm";
        }

        userServiceImpl.addUser(user);

        securityServiceImpl.autoLogin(user.getUsername(), user.getPasswordConfirm());
        return "redirect:/user/userProfile";
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "/login";
    }

    @GetMapping({"/user/userProfile"})
    public String welcome(Model model) {
        return "/user/userProfile";
    }
}
