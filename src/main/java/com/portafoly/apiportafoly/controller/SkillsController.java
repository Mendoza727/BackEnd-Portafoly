package com.portafoly.apiportafoly.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portafoly.apiportafoly.domain.skills.SkillsClass;
import com.portafoly.apiportafoly.domain.skills.SkillsRepository;
import com.portafoly.apiportafoly.domain.skills.Dtos.AddNewSkillDTO;
import com.portafoly.apiportafoly.domain.skills.Dtos.DataResponseSkillDto;
import com.portafoly.apiportafoly.domain.skills.Dtos.GetSkillDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/skills")
public class SkillsController {

    private SkillsRepository skillsRepository;

    private SkillsController(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }
    
    @GetMapping
    public Page<GetSkillDto> GetInfoSkills(@PageableDefault(size =  20) Pageable pagination) {
        return skillsRepository.findAll(pagination).map(GetSkillDto::new);
    }

    @PostMapping
    public ResponseEntity<DataResponseSkillDto> SetInfoSkills(@RequestBody @Valid AddNewSkillDTO addNewSkillDTO) {
        SkillsClass skillsClass = skillsRepository.save(new SkillsClass(addNewSkillDTO));
        DataResponseSkillDto response = new DataResponseSkillDto(
            skillsClass.getId(),
            skillsClass.getLogo(),
            skillsClass.getSkill(),
            skillsClass.getTipo(),
            skillsClass.getLevel(),
            skillsClass.getStars()
        );
        return ResponseEntity.created(null).body(response);
    }

}
