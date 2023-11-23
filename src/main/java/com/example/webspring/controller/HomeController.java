package com.example.webspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @RequestMapping("/")
    public List<String> greeting(){
        return List.of("Hallo", "Binar");
    }
}
