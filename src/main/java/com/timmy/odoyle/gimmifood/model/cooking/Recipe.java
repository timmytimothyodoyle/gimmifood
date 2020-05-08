package com.timmy.odoyle.gimmifood.model.cooking;

import java.util.ArrayList;
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

	public Recipe(String id, String name, String description, Difficulty difficulty) {
		super(id, name);
		this.difficulty = difficulty;
		this.description = description;
		this.ingredients = new ArrayList<Ingredient>();
	}

	public void addUtensil(Utensil u) {
		this.utensils.add(u);
	}

	public void addIngredient(Ingredient i) {
		this.ingredients.add(i);
	}

	public void addInstructions(Instruction i) {
		this.instructions.add(i);
	}

	public boolean containsFood(String f) {
		for (Ingredient i : ingredients) {
			if (i.getRaw().getName().equals(f))
				return true;
		}
		return false;
	}

	public int getCantidadIngredients() {
		return this.ingredients.size();
	}
}
