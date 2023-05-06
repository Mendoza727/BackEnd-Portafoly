package com.portafoly.apiportafoly.domain.experience.Dtos;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AddNewExperienceDTO(
    Long id,

    @NotBlank
    String empresa,

    @NotBlank
    String cargo,

    @NotNull
    Date fechaI,

    Date fechaF,

    @NotBlank
    String ciudad,

    @NotBlank
    String descripcion,
    String tecnologias
) {
    
}
