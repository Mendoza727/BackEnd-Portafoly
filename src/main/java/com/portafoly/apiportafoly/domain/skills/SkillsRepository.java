package com.portafoly.apiportafoly.domain.skills;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.portafoly.apiportafoly.domain.skills.Enums.TypeServiceSkill;

public interface SkillsRepository extends JpaRepository<SkillsClass, Long> {
    Page<SkillsClass> findByTipo(TypeServiceSkill tipo, Pageable pagination);
}
