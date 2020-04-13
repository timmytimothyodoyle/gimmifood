package com.timmy.odoyle.gimmifood.model;

public abstract class DefaultFood implements GimmiFood {

	protected String id;

	protected String name;

	public DefaultFood(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

}
