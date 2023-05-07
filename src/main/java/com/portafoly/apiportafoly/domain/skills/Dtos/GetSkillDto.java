package com.portafoly.apiportafoly.domain.skills.Dtos;

import com.portafoly.apiportafoly.domain.skills.SkillsClass;

public record GetSkillDto(
    Long id,
    String logo,
    String skill,
    String tipo
) {
        
    public GetSkillDto(SkillsClass skillsClass) {
        this(
            skillsClass.getId(),
            skillsClass.getLogo(),
            skillsClass.getSkill(),
            skillsClass.getTipo().toString()
        );
    }
    
}
