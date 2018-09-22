package com.guru.recipe.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Recipe recipe;

    @Lob
    private String recipeNote;
}
