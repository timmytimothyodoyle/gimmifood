package com.timmy.odoyle.gimmifood.model.cooking;

import com.timmy.odoyle.gimmifood.model.Unit;
import com.timmy.odoyle.gimmifood.model.material.Food;

public class Ingredient {

	private Food raw;
	
	private Unit unit;
	
	private Double amount;
	
	public Ingredient(Food raw) {
		this.raw = raw;
	}
	
	public Food getRaw() {
		return this.raw;
	}
}
