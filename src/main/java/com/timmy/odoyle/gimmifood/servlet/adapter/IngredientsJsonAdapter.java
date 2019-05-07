package com.timmy.odoyle.gimmifood.servlet.adapter;

import java.util.List;

import com.google.gson.Gson;
import com.timmy.odoyle.gimmifood.api.ItemAdapter;
import com.timmy.odoyle.gimmifood.model.Ingredient;

public class IngredientsJsonAdapter implements ItemAdapter<List<Ingredient>, String> {

	public String adapt(List<Ingredient> ingredients) {
		return new Gson().toJson(ingredients);
	}

}
