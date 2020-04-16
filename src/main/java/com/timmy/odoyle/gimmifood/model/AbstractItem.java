package com.timmy.odoyle.gimmifood.model;

public abstract class AbstractItem implements Item {

	protected String id;
	
	protected String name;
	
	public AbstractItem(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String getId() {
		return id;
	}
	
	@Override
	public String getName() {
		return name;
	}
}
