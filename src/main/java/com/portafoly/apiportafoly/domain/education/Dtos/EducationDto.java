package com.portafoly.apiportafoly.domain.education.Dtos;


import com.portafoly.apiportafoly.domain.education.Enums.TypeEducationEnum;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EducationDto(
    @NotBlank
    String institucion,
    @NotBlank
    String titulo,
    @NotNull
    String fechaI,

    String fechaF,

    @NotNull
    TypeEducationEnum tipo
) {}
