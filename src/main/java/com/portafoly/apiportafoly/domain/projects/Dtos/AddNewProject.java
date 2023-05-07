package com.portafoly.apiportafoly.domain.projects.Dtos;

import jakarta.validation.constraints.NotBlank;

public record AddNewProject(
    Long id,
    @NotBlank
    String projecto,
    @NotBlank
    String descripcion,
    @NotBlank
    String img,
    @NotBlank
    String repositorio,
    @NotBlank
    String link,
    @NotBlank
    String lenguage
) {}
