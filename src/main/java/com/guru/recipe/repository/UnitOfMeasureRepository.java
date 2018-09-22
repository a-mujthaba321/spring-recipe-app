package com.guru.recipe.repository;

import com.guru.recipe.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import javax.xml.soap.SAAJResult;
import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
