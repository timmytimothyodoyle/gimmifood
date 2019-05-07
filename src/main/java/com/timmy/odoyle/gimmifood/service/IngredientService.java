package com.timmy.odoyle.gimmifood.service;

import java.util.List;

import com.timmy.odoyle.gimmifood.model.Ingredient;
import com.timmy.odoyle.gimmifood.search.Query;

public interface IngredientService {

	boolean add(Ingredient ingredient);

	boolean remove(String id);

	Ingredient get(String id);

	List<Ingredient> get(Query query);
}
