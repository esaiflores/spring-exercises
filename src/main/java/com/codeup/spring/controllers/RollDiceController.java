package com.codeup.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RollDiceController {
    @GetMapping("/roll-dice")
    public String index() {
        return "roll-dice";
    }
}
