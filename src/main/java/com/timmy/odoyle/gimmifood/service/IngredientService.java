package com.timmy.odoyle.gimmifood.service;

import java.util.Collection;

import com.timmy.odoyle.gimmifood.model.Ingredient;

public interface IngredientService {

	void add(Ingredient ingrediente);
	
	void remove(String id);
	
	Ingredient get(String id);
	
	Collection<Ingredient> getAll();
}
