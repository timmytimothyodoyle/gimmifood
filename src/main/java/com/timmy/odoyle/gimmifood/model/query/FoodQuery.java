package com.timmy.odoyle.gimmifood.model.query;

public class FoodQuery {
	
	public enum QueryType { EXACT, AUTOCOMPLETE }

	private String term;
	
	private QueryType type;
	
	public String getTerm() {
		return term;
	}
	
	public QueryType getType() {
		return type;
	}
}
