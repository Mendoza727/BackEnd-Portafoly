package com.portafoly.apiportafoly.domain.projects.Dtos;

import com.portafoly.apiportafoly.domain.projects.ProjectClass;

public record GetInfoProjectsDto(
    Long id,
    String projecto,
    String descripcion,
    String img,
    String repositorio,
    String link,
    String lenguage
) {

    public GetInfoProjectsDto(ProjectClass projectClass) {
        this(
            projectClass.getId(),
            projectClass.getProjecto(),
            projectClass.getDescripcion(),
            projectClass.getImg(),
            projectClass.getRepositorio(),
            projectClass.getLink(),
            projectClass.getLenguage()
        );
    }
}
