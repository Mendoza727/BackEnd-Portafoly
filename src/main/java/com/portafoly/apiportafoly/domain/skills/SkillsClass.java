package com.portafoly.apiportafoly.domain.skills;

import com.portafoly.apiportafoly.domain.skills.Dtos.AddNewSkillDTO;
import com.portafoly.apiportafoly.domain.skills.Enums.TypeServiceSkill;

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

@Table(name ="skills")
@Entity(name = "Skill")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode( of = "id")
public class SkillsClass {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logo;
    private String skill;
    private String level;
    private Integer stars;

    @Enumerated(EnumType.STRING)
    private TypeServiceSkill tipo;


    public SkillsClass(AddNewSkillDTO addNewSkillDTO) {
        this.logo = addNewSkillDTO.logo();
        this.skill = addNewSkillDTO.skill();
        this.tipo = addNewSkillDTO.tipo();
        this.level = addNewSkillDTO.level();
        this.stars = addNewSkillDTO.stars();
    }

}
