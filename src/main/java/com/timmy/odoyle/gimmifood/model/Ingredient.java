package com.timmy.odoyle.gimmifood.model;

import java.util.UUID;

public class Ingredient {

	public String id;

	public String name;

	public String image;

	public transient Category category;

	public Ingredient(String name, String image, Category category) {
		this.id = UUID.nameUUIDFromBytes("mayacomecaca".getBytes()).toString();
		this.name = name;
		this.image = image;
		this.category = category;
	}
}
