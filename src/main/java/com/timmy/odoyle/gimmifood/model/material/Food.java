package com.timmy.odoyle.gimmifood.model.material;

import java.util.List;
import java.util.Map;

import com.timmy.odoyle.gimmifood.model.AbstractItem;
import com.timmy.odoyle.gimmifood.model.Alergy;
import com.timmy.odoyle.gimmifood.model.Category;
import com.timmy.odoyle.gimmifood.model.Unit;

public class Food extends AbstractItem {

	// the public path to image
	private String image;
	
	private String description;
	
	private Category category;
	
	private List<Alergy> alergies;
	
	// nutritional value per 100 g
	private Map<String, Unit> nutritionalMap;

	public String getImage() {
		return image;
	}

	public String getDescription() {
		return description;
	}

	public Category getCategory() {
		return category;
	}

	public List<Alergy> getAlergies() {
		return alergies;
	}

	public Map<String, Unit> getNutritionalMap() {
		return nutritionalMap;
	}
}
