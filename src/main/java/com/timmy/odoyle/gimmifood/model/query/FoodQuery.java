package com.timmy.odoyle.gimmifood.model.query;

public class FoodQuery {
	
	private String term;
	
	public FoodQuery(String term) {
		this.term = term;
	}
	
	public String getTerm() {
		return term;
	}
	

	public boolean isValid() {
		// TODO CHEQUEAR QUE EL TERM NO TENGA NUMEROS NI CARACTERES RAROS
		return true;
	}
}
