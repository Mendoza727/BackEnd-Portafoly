package com.portafoly.apiportafoly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import org.springframework.data.domain.Pageable;

import com.portafoly.apiportafoly.domain.education.EducationClass;
import com.portafoly.apiportafoly.domain.education.EducationRepository;
import com.portafoly.apiportafoly.domain.education.Dtos.DataResponseEducationDto;
import com.portafoly.apiportafoly.domain.education.Dtos.EducationDto;
import com.portafoly.apiportafoly.domain.education.Dtos.GetInfoEducationDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/education")
public class EducationController {

    @Autowired
    EducationRepository educationRepository;

    @GetMapping
    public Page<GetInfoEducationDTO> GetEducation(Pageable paginacion) {
        return educationRepository.findAll(paginacion).map(GetInfoEducationDTO::new);
    }

    @PostMapping
    public ResponseEntity<DataResponseEducationDto> SetNewEducation (@RequestBody @Valid EducationDto educationDto,
    UriComponentsBuilder uriComponentsBuilder) {
        EducationClass educationClass = educationRepository.save(new EducationClass(educationDto));
        DataResponseEducationDto response = new DataResponseEducationDto(
            educationClass.getId(), 
            educationClass.getInstitucion(),
            educationClass.getTitulo(), 
            educationClass.getFechaI(),
            educationClass.getFechaF(), 
            educationClass.getTipo()
        );
        return ResponseEntity.created(null).body(response);
    }

}
