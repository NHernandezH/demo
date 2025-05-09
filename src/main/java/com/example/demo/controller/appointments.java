package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/appointments")
public class appointments {

    @GetMapping("/register")
    public String register(Model model){
        return "appointment/register :: content";
    }

    @GetMapping("/check")
    public String check(Model model){
        return "appointment/check :: content";
    }
}
