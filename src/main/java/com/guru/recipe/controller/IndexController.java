package com.guru.recipe.controller;

import com.guru.recipe.model.Category;
import com.guru.recipe.model.UnitOfMeasure;
import com.guru.recipe.repository.CategoryRepository;
import com.guru.recipe.repository.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    CategoryRepository categoryRepo;
    UnitOfMeasureRepository unitOfMeasureRepo;

    public IndexController(CategoryRepository categoryRepo, UnitOfMeasureRepository unitOfMeasureRepo) {
        this.categoryRepo = categoryRepo;
        this.unitOfMeasureRepo = unitOfMeasureRepo;
    }

    @RequestMapping({"/","/index"})
    public String getIndexPage(){
        Optional<Category> categoryOptional = categoryRepo.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepo.findByDescription("Pinch");
        System.out.println("Category"+categoryOptional.get().getId());
        System.out.println("Unit"+unitOfMeasure.get().getId());
        return "index";
    }


}
