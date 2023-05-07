package com.portafoly.apiportafoly.domain.projects;

import com.portafoly.apiportafoly.domain.projects.Dtos.AddNewProject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "projects")
@Entity(name = "Project")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode( of = "id")
public class ProjectClass {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projecto;
    private String descripcion;
    private String img;
    private String repositorio;
    private String link;
    private String lenguage;


    public ProjectClass(AddNewProject addNewProject) {
        this.projecto = addNewProject.projecto();
        this.descripcion = addNewProject.descripcion();
        this.img = addNewProject.img();
        this.repositorio = addNewProject.repositorio();
        this.link = addNewProject.link();
        this.lenguage = addNewProject.lenguage();
    };
}
