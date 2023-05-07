package com.portafoly.apiportafoly.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portafoly.apiportafoly.domain.projects.ProjectClass;
import com.portafoly.apiportafoly.domain.projects.ProjectRepository;
import com.portafoly.apiportafoly.domain.projects.Dtos.AddNewProject;
import com.portafoly.apiportafoly.domain.projects.Dtos.DataResponseDto;
import com.portafoly.apiportafoly.domain.projects.Dtos.GetInfoProjectsDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/projects")
public class ProjectsController {

    ProjectRepository projectRepository;

    public ProjectsController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }
    
    @GetMapping
    public Page<GetInfoProjectsDto> GetInfoProject(Pageable pagination) {
        return projectRepository.findAll(pagination).map(GetInfoProjectsDto::new);
    }

    @PostMapping
    public ResponseEntity<DataResponseDto> SetInfoProject(@RequestBody @Valid AddNewProject addNewProject) {
        ProjectClass projectClass = projectRepository.save(new ProjectClass(addNewProject));
        DataResponseDto response = new DataResponseDto(
            projectClass.getId(),
            projectClass.getProjecto(),
            projectClass.getDescripcion(),
            projectClass.getImg(),
            projectClass.getRepositorio(),
            projectClass.getLink(),
            projectClass.getLenguage()
        );
        return ResponseEntity.created(null).body(response);
    }

}
