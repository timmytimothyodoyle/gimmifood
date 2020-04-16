package com.timmy.odoyle.gimmifood.model.adapter;

import java.util.List;

import com.google.gson.Gson;
import com.timmy.odoyle.gimmifood.model.material.Food;

public class FoodJsonAdapter implements ItemAdapter<Food> {
	
	private Gson gson;

	public FoodJsonAdapter() {
		this.gson = new Gson();
	}

	@Override
	public String adapt(Food item) {
		return gson.toJson(item);
	}

	@Override
	public String adapt(List<Food> items) {
		return gson.toJson(items);
	}

}
