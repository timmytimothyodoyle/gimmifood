package com.timmy.odoyle.gimmifood.model;

public enum Category {
	VEGETALES("vegetales"),
	FRUTAS("frutas"),
	CARNES("carnes"),
	PESCADOS("pescados"),
	LACTEOS("lacteos"),
	LEGUMBRES("legumbres"),
	CEREALES("cereales"),
	BEBIDAS("bebidas");
	
	private final String id;
	
	Category(String id) {
		this.id = id;
	}

	public static Category getById(String id) {
		for (Category category : values()) {
			if (category.id.equalsIgnoreCase(id)) {
				return category;
			}
		}
		return null;
	}
}
