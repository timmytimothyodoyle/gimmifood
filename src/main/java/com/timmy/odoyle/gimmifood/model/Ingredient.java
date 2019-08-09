package com.timmy.odoyle.gimmifood.model;

public class Ingredient {

	private String id;

	private String name;

	private Categoria category;
	
	public Ingredient(String name) {
		this.id = "yoquese";
		this.name = name;
		this.category = Categoria.PESCADO;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Categoria getCategory() {
		return category;
	}
}
