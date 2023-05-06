package com.portafoly.apiportafoly.domain.experience;

import java.sql.Date;

import com.portafoly.apiportafoly.domain.experience.Dtos.AddNewExperienceDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "experience")
@Entity(name = "Experience")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode( of = "id")
public class ExperienceClass {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String empresa;
    private String cargo;
    private Date fechaI;
    private Date fechaF;
    private String ciudad;
    private String descripcion;
    private String tecnologias;

    

    public ExperienceClass(AddNewExperienceDTO experienceDTO) {
        this.empresa     = experienceDTO.empresa();
        this.cargo       = experienceDTO.cargo();
        this.fechaI      = experienceDTO.fechaI();
        this.ciudad      = experienceDTO.ciudad();
        this.descripcion = experienceDTO.descripcion();
        this.tecnologias = experienceDTO.tecnologias();
    }

}
