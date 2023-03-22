package com.example.myspringdemo22.Controller;

import com.example.myspringdemo22.Model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "home/index";
    }

    @PostMapping("/personData")
    public String personData(@ModelAttribute Person person, Model model) {
        model.addAttribute("Claus", person);
        return "home/personData";
    }
}
