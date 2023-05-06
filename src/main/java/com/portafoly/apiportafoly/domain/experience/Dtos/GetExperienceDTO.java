package com.portafoly.apiportafoly.domain.experience.Dtos;

import java.sql.Date;

import com.portafoly.apiportafoly.domain.experience.ExperienceClass;

public record GetExperienceDTO(
    String empresa,
    String cargo,
    Date fechaI,
    Date fechaF,
    String ciudad,
    String descripcion,
    String tecnologias
) {
    public GetExperienceDTO(ExperienceClass experience) {
        this(
            experience.getEmpresa(),
            experience.getCargo(),
            experience.getFechaI(),
            experience.getFechaF(),
            experience.getCiudad(),
            experience.getDescripcion(),
            experience.getTecnologias()
        );
    }
}