package com.visma.testtask.services;

import com.visma.testtask.InstitutionStatus;
import com.visma.testtask.dto.InstitutionDto;
import com.visma.testtask.repo.InstitutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstitutionService {

    @Autowired
    private InstitutionRepository repo;

    public Optional<List<InstitutionDto>> findByLanguage(String lang, InstitutionStatus status) {
        return repo.findByLanguageAndStatus(lang, getStatusValue(status));
    }

    public String getStatusValue(InstitutionStatus status) {
        if (status == null) {
            return "%";
        } else {
            return String.valueOf(status);
        }
    }
}
