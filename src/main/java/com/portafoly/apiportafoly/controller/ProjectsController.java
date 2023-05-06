package com.portafoly.apiportafoly.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projects")
public class ProjectsController {
    
    @GetMapping
    public void GetInfoProject() {
            System.out.println("entro al metodo");
    }

    @PostMapping
    public void SetInfoProject() {
        System.out.println("entro al metodo");
    }

}
