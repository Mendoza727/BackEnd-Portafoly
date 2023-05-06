package com.portafoly.apiportafoly.domain.experience.Dtos;

import java.sql.Date;

public record DataResponseDto(
    Long id,
    String empresa,
    String cargo,
    Date fechaI,
    Date fechaF,
    String ciudad,
    String descripcion,
    String tecnologias    
) {}
