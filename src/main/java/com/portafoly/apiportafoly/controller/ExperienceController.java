package com.portafoly.apiportafoly.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portafoly.apiportafoly.domain.experience.ExperienceClass;
import com.portafoly.apiportafoly.domain.experience.ExperienceRepository;
import com.portafoly.apiportafoly.domain.experience.Dtos.AddNewExperienceDTO;
import com.portafoly.apiportafoly.domain.experience.Dtos.DataResponseDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/experience")
public class ExperienceController {
    
    private ExperienceRepository experienceRepository;

    private ExperienceController(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    @GetMapping
    public void GetInfoExperience() {
        System.out.println("entro al metodo");
    }

    @PostMapping
    public ResponseEntity<DataResponseDto> SetInfoExperience(@RequestBody @Valid AddNewExperienceDTO experience) {
        ExperienceClass experienceClass = experienceRepository.save(new ExperienceClass(experience));
        DataResponseDto response = new DataResponseDto(
            experienceClass.getId(),
            experience.empresa(),
            experience.cargo(),
            experience.fechaI(),
            experience.fechaF(),
            experience.ciudad(),
            experience.descripcion(),
            experience.descripcion()  
        );
        return ResponseEntity.created(null).body(response);
    }

}
