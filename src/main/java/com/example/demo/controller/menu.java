package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class menu {

    @GetMapping("/menu")
    public String menu(Model model){
        model.addAttribute("mensaje","Hola Spring ");
        return "common/menu";
    }
}
