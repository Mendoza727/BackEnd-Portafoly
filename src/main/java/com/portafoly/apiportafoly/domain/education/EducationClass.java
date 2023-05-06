package com.portafoly.apiportafoly.domain.education;


import com.portafoly.apiportafoly.domain.education.Dtos.EducationDto;
import com.portafoly.apiportafoly.domain.education.Enums.TypeEducationEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table( name = "education")
@Entity(name = "Education")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class EducationClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String institucion;
    private String titulo;
    private String fechaI;
    private String fechaF;

    @Enumerated(EnumType.STRING)
    private TypeEducationEnum tipo;


    /**
     * @param educationDto
     */
    public EducationClass(EducationDto educationDto) {
        this.institucion = educationDto.institucion();
        this.titulo = educationDto.titulo();
        this.fechaI = educationDto.fechaI();
        this.fechaF = educationDto.fechaF();
        this.tipo = educationDto.tipo();
    }

}
