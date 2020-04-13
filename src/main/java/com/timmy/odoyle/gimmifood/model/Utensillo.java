package com.timmy.odoyle.gimmifood.model;

import java.util.Map;

public class Utensillo extends DefaultFood {


	public Utensillo(String id, String name) {
		super(id, name);
		
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

}
