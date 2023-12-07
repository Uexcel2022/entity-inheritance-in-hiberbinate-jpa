package com.uexcel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;

// @MappedSuperclass //just to put the similar attributes in the children table can not be reffered to for query.
//STRATEGIES

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// @Inheritance(strategy = InheritanceType.JOINED)
// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Computer {
    @Id
    protected long Id;
    protected String name;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
