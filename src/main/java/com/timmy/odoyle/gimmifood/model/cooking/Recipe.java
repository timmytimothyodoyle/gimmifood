package com.timmy.odoyle.gimmifood.model.cooking;

import java.util.List;

import com.timmy.odoyle.gimmifood.model.AbstractItem;
import com.timmy.odoyle.gimmifood.model.Difficulty;
import com.timmy.odoyle.gimmifood.model.material.Utensil;

public class Recipe extends AbstractItem {
	
	private String image;
	
	private String description;

	private Difficulty difficulty;
	
	private List<Utensil> utensils;

	private List<Ingredient> ingredients;

	private List<Instruction> instructions;
}
