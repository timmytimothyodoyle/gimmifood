package com.timmy.odoyle.gimmifood.model;

public class Ingredient extends DefaultFood {

	private Categoria category;

	public Ingredient(String id, String name, Categoria category) {
		super(id, name);
		this.category = category;
	}

	public Categoria getCategory() {
		return category;
	}
}
