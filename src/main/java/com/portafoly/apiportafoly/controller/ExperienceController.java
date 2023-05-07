package com.portafoly.apiportafoly.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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
import com.portafoly.apiportafoly.domain.experience.Dtos.GetExperienceDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/experience")
public class ExperienceController {
    
    private ExperienceRepository experienceRepository;

    private ExperienceController(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    @GetMapping
    public Page<GetExperienceDTO> GetEducation(Pageable paginacion) {
        return experienceRepository.findAll(paginacion).map(GetExperienceDTO::new);
    }

    @PostMapping
    public ResponseEntity<DataResponseDto> SetInfoExperience(@RequestBody @Valid AddNewExperienceDTO experience) {
        ExperienceClass experienceClass = experienceRepository.save(new ExperienceClass(experience));
        String tecnologias = "No hay informacion";
        if ( experience.tecnologias() != null) {
            String tecnologia = experience.tecnologias();
            tecnologias = tecnologia;
        }
        DataResponseDto response = new DataResponseDto(
            experienceClass.getId(),
            experience.empresa(),
            experience.cargo(),
            experience.fechaI(),
            experience.fechaF(),
            experience.ciudad(),
            experience.descripcion(),
            tecnologias  
        );
        return ResponseEntity.created(null).body(response);
    }

}
