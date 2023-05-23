package com.visma.testtask.services;

import com.visma.testtask.repo.InstitutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstitutionService {

    @Autowired
    InstitutionRepository repo;

}
