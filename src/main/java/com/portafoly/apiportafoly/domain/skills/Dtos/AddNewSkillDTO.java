package com.portafoly.apiportafoly.domain.skills.Dtos;

import com.portafoly.apiportafoly.domain.skills.Enums.TypeServiceSkill;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AddNewSkillDTO(
    Long id, 

    @NotBlank
    String logo, 

    @NotBlank
    String skill, 
    
    @NotNull
    TypeServiceSkill tipo,

    String level,

    Integer stars
) {}
