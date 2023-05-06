package com.portafoly.apiportafoly.domain.education.Dtos;


import com.portafoly.apiportafoly.domain.education.Enums.TypeEducationEnum;

public record DataResponseEducationDto(
    Long id,
    String getNombreInstitucion,
    String titulo,
    String fechaIni,
    String fechaFin,
    TypeEducationEnum tipoEducacion
) {}
