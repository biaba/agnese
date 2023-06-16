package com.visma.testtask.repo;

import com.visma.testtask.dto.InstitutionDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InstitutionRepository extends JpaRepository<InstitutionDto,Long> {

    @Query(value = "SELECT *\n" +
            "FROM institutions inst\n" +
            "INNER JOIN classifiers_translations tr\n" +
            "ON inst.type_id = tr.classifier_id WHERE tr.language = ?1 AND inst.status LIKE ?2", nativeQuery = true)
    Optional<List<InstitutionDto>> findByLanguageAndStatus(String lang, String status);
}
