package com.timmy.odoyle.gimmifood.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.timmy.odoyle.gimmifood.model.Category;
import com.timmy.odoyle.gimmifood.model.material.Food;
import com.timmy.odoyle.gimmifood.service.FoodQueryService;

public class MockFoodQueryService implements FoodQueryService {
	List<Food> foods;

	public MockFoodQueryService() {
		foods = new ArrayList<Food>();
		foods.add(new Food("1", "Papa", Category.TUBERCULOS));
		foods.add(new Food("2", "Papaya", Category.FRUTA));
		foods.add(new Food("3", "Pomelo", Category.FRUTA));
		foods.add(new Food("4", "Paprika", Category.CONDIMENTOS));
		foods.add(new Food("5", "Pollo", Category.CARNE));
		foods.add(new Food("6", "Queso", Category.LACTEO));
		foods.add(new Food("7", "Arroz", Category.CEREAL));
		foods.add(new Food("8", "Carne picada", Category.CARNE));
		foods.add(new Food("9", "Morron", Category.VEGETAL));
		foods.add(new Food("10", "Cebolla", Category.VEGETAL));
		foods.add(new Food("11", "Moztaza", Category.CONDIMENTOS));
		foods.add(new Food("12", "Morcilla", Category.CARNE));
	}

	@Override
	public Food get(String name) {
		for (Food food : foods) {
			if (food.getName().toLowerCase().equalsIgnoreCase(name.toLowerCase()))
				return food;
		}
		return null;
	}

	@Override
	public List<Food> predict(String name) {
		List<Food> result = new ArrayList<Food>();
		for (Food food : foods) {
			if (food.getName().toLowerCase().contains(name.toLowerCase()))
				result.add(food);
		}
		return result;
	}

}
