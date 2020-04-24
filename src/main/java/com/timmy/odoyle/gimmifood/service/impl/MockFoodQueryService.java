package com.timmy.odoyle.gimmifood.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.timmy.odoyle.gimmifood.model.Category;
import com.timmy.odoyle.gimmifood.model.cooking.Ingredient;
import com.timmy.odoyle.gimmifood.model.material.Food;
import com.timmy.odoyle.gimmifood.service.FoodQueryService;

public class MockFoodQueryService implements FoodQueryService {
	List<Food> foods;

	public MockFoodQueryService() {
		foods = new ArrayList<Food>();
		Food papa = new Food("1", "Papa", Category.TUBERCULOS);
		Food patata = new Food("2", "Patata", Category.TUBERCULOS);
		Food queso = new Food("2", "Queso", Category.LACTEO);
		Food arroz = new Food("3", "Arroz", Category.CEREAL);
		Food carne_picada = new Food("4", "Carne picada", Category.CARNE);
		foods.add(papa);
		foods.add(patata);
		foods.add(queso);
		foods.add(arroz);
		foods.add(carne_picada);
	}

	@Override
	public Food get(String name) {
		for (Food food : foods) {
			if (food.getName().equalsIgnoreCase(name.toLowerCase()))
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
