package com.timmy.odoyle.gimmifood.service;

import com.timmy.odoyle.gimmifood.model.Ingrediente;

public interface IngredienteService {

	boolean add(Ingrediente ingrediente);
	
	boolean remove(String id);
}
