package com.portafoly.apiportafoly.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portafoly.apiportafoly.domain.skills.SkillsRepository;

@RestController
@RequestMapping("/skills")
public class SkillsController {

    private SkillsRepository skillsRepository;

    private SkillsController(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }
    
    @GetMapping
    public void GetInfoSkills() {

    }

    @PostMapping
    public void SetInfoSkills() {

    }

}
