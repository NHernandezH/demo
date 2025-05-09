package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Login {

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("mensaje","Hola Spring ");
        return "login";
    }

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("mensaje","Hola Spring ");
        return "index";
    }

    @GetMapping("/menu")
    public String menu(Model model){
        model.addAttribute("mensaje","Hola Spring ");
        return "common/menu";
    }
}
