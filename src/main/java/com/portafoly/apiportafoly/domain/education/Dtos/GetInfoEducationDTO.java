package com.portafoly.apiportafoly.domain.education.Dtos;

import com.portafoly.apiportafoly.domain.education.EducationClass;

public record GetInfoEducationDTO(
    Long id,
    String institucion,
    String titulo,
    String fechaI,
    String fechaF,
    String tipo
) {
    
    public GetInfoEducationDTO(EducationClass education) {
        this(
            education.getId(),
            education.getInstitucion(),
            education.getTitulo(),
            education.getFechaI(),
            education.getFechaF(),
            education.getTipo().toString()
        );
    }

}
