package com.visma.testtask.dto;

import com.visma.testtask.InstitutionStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="institutions")
public class InstitutionDto {

    @Id
    private Long id;

    private String name;
    @Column(name="reg_num")
    private String regNum;
    @Column(name="reg_date")
    private LocalDateTime regDate;

    @OneToOne
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    private Classifiers classifiers;

    @Enumerated(EnumType.STRING)
    private InstitutionStatus status;

    public InstitutionDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getType() {
        return classifiers.getCode();
    }

    public void setType(String type) {
        this.classifiers.setCode(type);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Classifiers getClassifiers() {
        return classifiers;
    }

    public void setClassifiers(Classifiers classifiers) {
        this.classifiers = classifiers;
    }

    public InstitutionStatus getStatus() {
        return status;
    }

    public void setStatus(InstitutionStatus status) {
        this.status = status;
    }
}
