package com.timmy.odoyle.gimmifood.servlet.adapter;

import javax.servlet.http.HttpServletRequest;

import com.timmy.odoyle.gimmifood.model.query.RecipeQuery;

public class HttpRequestRecipeQueryAdapter {

	public RecipeQuery adapt(HttpServletRequest request) {
		// Deberias volver food o strings?
		//Que chotas hace getParameterValues() que no puedo verlo antes a los valores???
		//Quise devolver ingredients pero nose como ver como vienen los parametros
		return new RecipeQuery(request.getParameterValues("term[]"));
	}
}
