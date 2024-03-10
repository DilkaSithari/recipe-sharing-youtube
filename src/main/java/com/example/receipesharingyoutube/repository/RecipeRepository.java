package com.example.receipesharingyoutube.repository;

import com.example.receipesharingyoutube.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface RecipeRepository extends JpaRepository<Recipe,Long> {

}
