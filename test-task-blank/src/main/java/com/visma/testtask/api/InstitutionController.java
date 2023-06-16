package com.visma.testtask.api;

import com.visma.testtask.InstitutionStatus;
import com.visma.testtask.dto.InstitutionDto;
import com.visma.testtask.repo.InstitutionRepository;
import com.visma.testtask.services.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/institutions")
public class InstitutionController {

    /*
     *   ----------------------------------------------------------------------------------------------------------------
     *   |FRONT-END          |DATABASE                           |ADDITIONAL TASK
     *   ----------------------------------------------------------------------------------------------------------------
     *   |name               |institutions.name                  | -
     *   |regNum             |institutions.reg_num               | -
     *   |regDate            |institutions.reg_date              | -
     *   |type               |classifiers_translations.text      |atkarīgs no valodas
     *   ----------------------------------------------------------------------------------------------------------------
     */

    @Autowired
    InstitutionService service;
    @Autowired
    InstitutionRepository repo;

    @GetMapping()
    public List<InstitutionDto> getInstitutions(@RequestParam("language") String lang,
                                                @RequestParam(value = "status", required = false) InstitutionStatus status) {


        return service.findByLanguage(lang, status).get();
    }
}
