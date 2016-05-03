package com.example.rated.domain;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.xml.bind.annotation.XmlTransient;

@MappedSuperclass
abstract class DatabaseObject {
    private Long id;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @XmlTransient
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}


