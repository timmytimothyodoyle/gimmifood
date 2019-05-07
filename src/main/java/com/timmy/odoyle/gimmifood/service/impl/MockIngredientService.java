package com.timmy.odoyle.gimmifood.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.timmy.odoyle.gimmifood.model.Category;
import com.timmy.odoyle.gimmifood.model.Ingredient;
import com.timmy.odoyle.gimmifood.search.Query;
import com.timmy.odoyle.gimmifood.service.IngredientService;

public class MockIngredientService implements IngredientService {
	
	private Map<Category, List<Ingredient>> ingredientsMap;
	
	public MockIngredientService() {
		ingredientsMap = new HashMap<>();
		ingredientsMap.put(Category.CARNES, Arrays.asList(
				new Ingredient("Bife de Chorizo", "media/meat-icon-14.jpg", Category.CARNES),
				new Ingredient("Costillas de vaca", null, Category.CARNES)));
		ingredientsMap.put(Category.PESCADOS, Arrays.asList(
				new Ingredient("Salmon", "media/salmon.png", Category.PESCADOS),
				new Ingredient("Trucha", null, Category.PESCADOS)));
		ingredientsMap.put(Category.BEBIDAS, Arrays.asList(
				new Ingredient("Quilmes", "media/corn.png", Category.BEBIDAS),
				new Ingredient("Hendrix", "media/corn.png", Category.BEBIDAS)));
		ingredientsMap.put(Category.VEGETALES, Arrays.asList(
				new Ingredient("Tomate", "media/corn.png", Category.VEGETALES),
				new Ingredient("Romero", null, Category.VEGETALES),
				new Ingredient("Pimiento del Padron", null, Category.VEGETALES)));
	}

	@Override
	public boolean add(Ingredient ingredient) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Ingredient get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ingredient> get(Query query) {
		return ingredientsMap.get(query.getCategory());
	}

}
