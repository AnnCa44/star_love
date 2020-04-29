package com.starlove.starlove.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/home")
    public String home() {

        return "home";
    }

    @GetMapping("/profil")
    public String profil() {

        return "profil";
    }

    @GetMapping("/try-again")
    public String tryAgain() {

        return "try-again";
    }

}