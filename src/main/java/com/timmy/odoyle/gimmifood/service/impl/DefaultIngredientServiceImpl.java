package com.timmy.odoyle.gimmifood.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.timmy.odoyle.gimmifood.model.Ingredient;
import com.timmy.odoyle.gimmifood.service.IngredientService;

public class DefaultIngredientServiceImpl implements IngredientService {
	
	private Map<String, Ingredient> ingredients;
	
	public DefaultIngredientServiceImpl() {
		ingredients = new HashMap<String, Ingredient>();
		ingredients.put("Uno", new Ingredient("Uno"));
		ingredients.put("Dos", new Ingredient("Dos"));
		ingredients.put("Tres", new Ingredient("Tres"));
		ingredients.put("Cuatro", new Ingredient("Cuatro"));
	}

	public void add(Ingredient ingrediente) {
		ingredients.put(ingrediente.getId(), ingrediente);
	}

	public void remove(String id) {
		ingredients.remove(id);
	}

	public Ingredient get(String id) {
		return ingredients.get(id);
	}

	public Collection<Ingredient> getAll() {
		return ingredients.values();
	}
}
