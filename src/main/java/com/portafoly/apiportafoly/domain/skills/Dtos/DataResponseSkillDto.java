package com.portafoly.apiportafoly.domain.skills.Dtos;

import com.portafoly.apiportafoly.domain.skills.Enums.TypeServiceSkill;

public record DataResponseSkillDto(
    Long id,
    String logo,
    String skill,
    TypeServiceSkill tipo,
    String level,
    Integer stars
) {}
