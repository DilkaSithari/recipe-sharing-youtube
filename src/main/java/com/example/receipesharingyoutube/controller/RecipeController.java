package com.example.receipesharingyoutube.controller;

import com.example.receipesharingyoutube.model.Recipe;
import com.example.receipesharingyoutube.model.User;
import com.example.receipesharingyoutube.repository.UserRepository;
import com.example.receipesharingyoutube.service.RecipeService;
import com.example.receipesharingyoutube.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {
    @Autowired
    private RecipeService recipeService;
    @Autowired
    private UserService userService;
    @PostMapping("/user/{userId}")
    public Recipe createRecipe(@RequestBody Recipe recipe, @PathVariable Long userId) throws Exception {
        User user = userService.findUserById(userId);

        Recipe createRecipe=recipeService.createRecipe(recipe,user);
        return createRecipe;
    }
    @GetMapping()
    public List<Recipe> getAllRecipe() throws Exception {
        List<Recipe> recipes =recipeService.findAllRecipe();
        return recipes;
    }
    @DeleteMapping("/{recipeId}")
    public String  deleteRecipe(@PathVariable Long recipeId) throws Exception {
        recipeService.deleteRecipe(recipeId);
        return "recipe deleted successfully";
    }
    @PutMapping("/{id}")
    public Recipe updateRecipe(@RequestBody Recipe recipe, @PathVariable Long id) throws Exception {

        Recipe updateRecipe=recipeService.updateRecipe(recipe,id);
        return updateRecipe;
    }

    @PutMapping("/{id}/like/user/{userId}")
    public Recipe likeRecipe(@PathVariable Long userId, @PathVariable Long id) throws Exception {

        User user = userService.findUserById(userId);
        Recipe likeRecipe=recipeService.likeRecipe(id,user);
        return likeRecipe;
    }
}
