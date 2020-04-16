package com.timmy.odoyle.gimmifood.model.query;

public class FoodQuery {
	
	public enum QueryType { EXACT, AUTOCOMPLETE }

	private String term;
	
	private QueryType type;
	
	public FoodQuery(String term, QueryType type) {
		this.term = term;
		this.type = type;
	}
	
	public String getTerm() {
		return term;
	}
	
	public QueryType getType() {
		return type;
	}
}
