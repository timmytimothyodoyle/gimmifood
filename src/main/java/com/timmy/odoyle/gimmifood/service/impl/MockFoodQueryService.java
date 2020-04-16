package com.timmy.odoyle.gimmifood.service.impl;

import java.util.List;

import com.timmy.odoyle.gimmifood.model.Category;
import com.timmy.odoyle.gimmifood.model.material.Food;
import com.timmy.odoyle.gimmifood.service.FoodQueryService;

public class MockFoodQueryService implements FoodQueryService {
	Food papa = new Food("1", "Papa", Category.TUBERCULOS);
	@Override
	public Food get(String name) {
		if(papa.getName().equals(name)) 
			return papa;
		else
			return null;
	}

	@Override
	public List<Food> predict(String... args) {
		// TODO Auto-generated method stub
		return null;
	}

}
