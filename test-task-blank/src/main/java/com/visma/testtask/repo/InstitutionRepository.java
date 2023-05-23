package com.visma.testtask.repo;

import com.visma.testtask.dto.InstitutionDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutionRepository extends JpaRepository<InstitutionDto,Long> {
}
