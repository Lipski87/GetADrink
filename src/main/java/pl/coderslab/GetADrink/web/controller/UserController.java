package pl.coderslab.GetADrink.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.GetADrink.model.User;

@Controller
@RequestMapping("/user")
public class UserController {


    @GetMapping("/registration")
    public String getRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "/userRegistrationForm";
    }

    @PostMapping("/registration")
    @ResponseBody
    public String processRegistrationForm(@ModelAttribute User user){
        return user.toString();
    }
}
