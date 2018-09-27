package com.guru.recipe.service;

import com.guru.recipe.model.Recipe;
import com.guru.recipe.repository.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepo;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepo);
    }

    @Test
    public void getRecipes() throws Exception {

        Recipe recipe = new Recipe();
        HashSet recipeSet = new HashSet();
        recipeSet.add(recipe);

        Mockito.when(recipeService.getRecipes()).thenReturn(recipeSet);

        Set<Recipe> recipes = recipeService.getRecipes();
        assertEquals(recipes.size(),1);
        Mockito.verify(recipeRepo, Mockito.times(1)).findAll();

    }



}