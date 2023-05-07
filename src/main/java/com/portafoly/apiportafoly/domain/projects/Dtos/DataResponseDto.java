package com.portafoly.apiportafoly.domain.projects.Dtos;

public record DataResponseDto(
    Long id,
    String projecto,
    String descripcion,
    String img,
    String repositorio,
    String link,
    String lenguage
) {}
