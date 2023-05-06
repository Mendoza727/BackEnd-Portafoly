package com.portafoly.apiportafoly.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experience")
public class ExperienceController {
    
    @GetMapping
    public void GetInfoExperience() {
        System.out.println("entro al metodo");
    }

    @PostMapping
    public void SetInfoExperience() {
        System.out.println("entro al metodo post");
    }

}
