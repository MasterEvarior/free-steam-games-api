package com.giannin.freesteamgamesapi.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Category {
    @Id
    @Setter(AccessLevel.NONE)
    private Integer id;
    private String description;

    public Category(Integer id, String description){
        this.id = id;
        this.description = description;
    }
}
