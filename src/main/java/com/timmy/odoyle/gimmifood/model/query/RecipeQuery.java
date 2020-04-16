package com.timmy.odoyle.gimmifood.model.query;

import java.util.ArrayList;

public class RecipeQuery {
	
	private String term;
	
	public RecipeQuery(String term) {
		this.term = term;
	}
	


	public boolean isValid() {
		// TODO CHEQUEAR QUE EL TERM NO TENGA NUMEROS NI CARACTERES RAROS
		return true;
	}
}
