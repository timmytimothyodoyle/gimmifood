package com.timmy.odoyle.gimmifood.model.query;

public class RecipeQuery {
	
	private String[] terms;
	
	public RecipeQuery(String[] terms) {
		this.terms = terms;
	}
	


	public boolean isValid() {
		// TODO CHEQUEAR QUE EL TERM NO TENGA NUMEROS NI CARACTERES RAROS
		return true;
	}



	public String[] getTerm() {
		return terms;
	}
}
