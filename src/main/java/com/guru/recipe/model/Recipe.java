package com.guru.recipe.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;

    private Integer cookTime;

    private Integer prepTime;

    private Integer servings;

    private String source;

    private String url;

    private String directions;

    @Lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)
    private Note note;
}
