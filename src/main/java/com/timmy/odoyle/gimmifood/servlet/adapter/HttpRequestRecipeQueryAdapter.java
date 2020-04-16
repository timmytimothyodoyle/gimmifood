package com.timmy.odoyle.gimmifood.servlet.adapter;

import javax.servlet.http.HttpServletRequest;

import com.timmy.odoyle.gimmifood.model.query.RecipeQuery;

public class HttpRequestRecipeQueryAdapter {

	public RecipeQuery adapt(HttpServletRequest request) {
		// Deberias volver food o strings?
		return new RecipeQuery(request.getParameter("term"));
	}
}
