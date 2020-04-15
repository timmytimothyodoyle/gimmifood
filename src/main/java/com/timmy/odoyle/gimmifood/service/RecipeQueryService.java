package com.timmy.odoyle.gimmifood.service;

import java.util.List;

import com.timmy.odoyle.gimmifood.model.cooking.Recipe;
import com.timmy.odoyle.gimmifood.model.material.Food;

public interface RecipeQueryService {

	List<Recipe> get(List<Food> items);
}
