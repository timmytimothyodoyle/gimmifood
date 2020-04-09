package com.timmy.odoyle.gimmifood.model.adapter;

import java.util.Collection;

import com.google.gson.JsonArray;
import com.timmy.odoyle.gimmifood.model.Ingredient;

public class IngredientJsonAdapter {

	public JsonArray adapt(Collection<Ingredient> ingredients) {
		JsonArray adapted = new JsonArray();
		for (Ingredient ingredient : ingredients) {
			adapted.add(ingredient.getName());
		}
		return adapted;
	}
}
