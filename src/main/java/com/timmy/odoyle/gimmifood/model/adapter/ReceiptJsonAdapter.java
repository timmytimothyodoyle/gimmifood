package com.timmy.odoyle.gimmifood.model.adapter;

import com.google.gson.Gson;
import com.timmy.odoyle.gimmifood.model.Receta;

public class ReceiptJsonAdapter implements GimmiFoodAdapter<Receta>{

	public String adapt(Receta receta) {
		Gson gson = new Gson();
		return gson.toJson(receta);
	
	}
}
