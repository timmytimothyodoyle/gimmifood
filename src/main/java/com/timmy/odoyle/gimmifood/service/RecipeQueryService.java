package com.timmy.odoyle.gimmifood.service;

import java.util.List;

import com.timmy.odoyle.gimmifood.model.cooking.Recipe;

public interface RecipeQueryService {

	List<Recipe> get(String[] foods);
}
