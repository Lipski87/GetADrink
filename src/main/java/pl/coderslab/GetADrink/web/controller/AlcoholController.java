package pl.coderslab.GetADrink.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.GetADrink.web.service.drink.AlcoholService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
@RequestMapping("alcohol")
public class AlcoholController {

    private final AlcoholService alcoholService;


    @GetMapping("/details")
    public String getDrinkByName(HttpServletRequest request, Model model) {
        model.addAttribute("alcohol", alcoholService.getAlcoholDetails(request.getParameter("alcohol")));
        return "/alcoholDetails";
    }
}
