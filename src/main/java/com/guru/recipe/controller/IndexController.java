package com.guru.recipe.controller;

import com.guru.recipe.model.Category;
import com.guru.recipe.model.UnitOfMeasure;
import com.guru.recipe.repository.CategoryRepository;
import com.guru.recipe.repository.UnitOfMeasureRepository;
import com.guru.recipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/","/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }


}
