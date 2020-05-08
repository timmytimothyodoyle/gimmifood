package com.timmy.odoyle.gimmifood.model.adapter;

import java.util.List;

import com.google.gson.Gson;
import com.timmy.odoyle.gimmifood.model.cooking.Recipe;

public class RecipeJsonAdapter implements ItemAdapter<Recipe> {
	
	private Gson gson;

	public RecipeJsonAdapter() {
		this.gson = new Gson();
	}

	@Override
	public String adapt(Recipe item) {
		return gson.toJson(item);
	}

	@Override
	public String adapt(List<Recipe> items) {
		return gson.toJson(items);
	}

}
