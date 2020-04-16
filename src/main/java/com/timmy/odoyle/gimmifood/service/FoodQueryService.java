package com.timmy.odoyle.gimmifood.service;

import java.util.List;

import com.timmy.odoyle.gimmifood.model.material.Food;

public interface FoodQueryService {
	
	Food get(String name);

	List<Food> predict(String name);
}
