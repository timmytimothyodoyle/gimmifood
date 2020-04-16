package com.timmy.odoyle.gimmifood.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.timmy.odoyle.gimmifood.model.Category;
import com.timmy.odoyle.gimmifood.model.Difficulty;
import com.timmy.odoyle.gimmifood.model.cooking.Ingredient;
import com.timmy.odoyle.gimmifood.model.cooking.Recipe;
import com.timmy.odoyle.gimmifood.model.material.Food;
import com.timmy.odoyle.gimmifood.service.RecipeQueryService;

public class MockRecipeQueryService implements RecipeQueryService {
	List<Recipe> recipes;

	public MockRecipeQueryService() {
		Food papa = new Food("1", "Papa", Category.TUBERCULOS);
		Ingredient papa_i = new Ingredient(papa);
		Food queso = new Food("2", "Queso", Category.LACTEO);
		Ingredient queso_i = new Ingredient(queso);
		Food arroz = new Food("3", "Arroz", Category.CEREAL);
		Ingredient arroz_i = new Ingredient(arroz);
		Food carne_picada = new Food("4", "Carne picada", Category.CARNE);
		Ingredient carne_picada_i = new Ingredient(carne_picada);

		this.recipes = new ArrayList<Recipe>();
		Recipe pastel_papa = new Recipe("1", "Pastel de papa", "Es una comida rica", Difficulty.FACIL);
		Recipe paella = new Recipe("2", "Paella", "Es una comida con muchas cosas", Difficulty.DIFICIL);
		pastel_papa.addIngredient(papa_i);
		pastel_papa.addIngredient(queso_i);
		pastel_papa.addIngredient(carne_picada_i);
		paella.addIngredient(arroz_i);
		this.recipes.add(pastel_papa);
		this.recipes.add(paella);

	}

	@Override
	public List<Recipe> get(List<Food> foods) {

		List<Recipe> result = this.recipes;
		for (Food food : foods) {
			for (Recipe recipe : result) {
				if (!recipe.containsFood(food))
					result.remove(recipe);
			}
		}
		return result;
	}
}
