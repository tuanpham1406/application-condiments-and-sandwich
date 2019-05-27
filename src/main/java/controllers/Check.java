package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Check {
    @GetMapping("/xxx")
    public String xxx() {
        return "index";
    }
    @RequestMapping("/save")
    public String save(@RequestParam(required = false) String lettuce, @RequestParam(required = false) String tomato, @RequestParam(required = false) String mustard, @RequestParam(required = false) String sprouts, Model model) {
    model.addAttribute("lettuce", lettuce);
    model.addAttribute("tomato", tomato);
    model.addAttribute("mustard", mustard);
    model.addAttribute("sprouts", sprouts);
        return "display";
    }
}
