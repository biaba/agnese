package com.visma.testtask.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Classifiers {

    @Id
    private Long id;

    private String code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
