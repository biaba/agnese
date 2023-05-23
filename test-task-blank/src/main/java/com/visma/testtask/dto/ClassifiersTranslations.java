package com.visma.testtask.dto;

import javax.persistence.*;

@Entity(name = "classifiers_translations")
public class ClassifiersTranslations {

    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "classifier_id", referencedColumnName = "id")
    // FOREIGN KEY (classifier_id) REFERENCES classifiers(id);
    private Classifiers classifiers;

    private String text;

    private String language;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Classifiers getClassifiers() {
        return classifiers;
    }

    public void setClassifiers(Classifiers classifiers) {
        this.classifiers = classifiers;
    }
}
