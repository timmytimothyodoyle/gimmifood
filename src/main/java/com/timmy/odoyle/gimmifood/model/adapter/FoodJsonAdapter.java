package com.timmy.odoyle.gimmifood.model.adapter;

import java.util.List;

import com.google.gson.Gson;
import com.timmy.odoyle.gimmifood.model.material.Food;

public class FoodJsonAdapter implements ItemAdapter<Food> {

	@Override
	public String adapt(Food item) {
		Gson gson = new Gson();
		return gson.toJson(item);
	}

	@Override
	public String adapt(List<Food> items) {
		Gson gson = new Gson();
		return gson.toJson(items);
	}

}
