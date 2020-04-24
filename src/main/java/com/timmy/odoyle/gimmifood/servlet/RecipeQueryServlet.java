package com.timmy.odoyle.gimmifood.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.timmy.odoyle.gimmifood.model.adapter.ItemAdapter;
import com.timmy.odoyle.gimmifood.model.adapter.RecipeJsonAdapter;
import com.timmy.odoyle.gimmifood.model.cooking.Recipe;
import com.timmy.odoyle.gimmifood.model.material.Food;
import com.timmy.odoyle.gimmifood.model.query.RecipeQuery;
import com.timmy.odoyle.gimmifood.service.RecipeQueryService;
import com.timmy.odoyle.gimmifood.service.impl.MockRecipeQueryService;
import com.timmy.odoyle.gimmifood.servlet.adapter.HttpRequestRecipeQueryAdapter;

@WebServlet("/recipe")
public class RecipeQueryServlet extends HttpServlet {

	private static final long serialVersionUID = 4177899967599719916L;

	private RecipeQueryService queryService;
	
	private HttpRequestRecipeQueryAdapter requestAdapter;
	
	private ItemAdapter<Recipe> recipeJsonAdapter;

	
	public RecipeQueryServlet() {
		queryService = new MockRecipeQueryService();
		requestAdapter = new HttpRequestRecipeQueryAdapter();
		recipeJsonAdapter = new RecipeJsonAdapter();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("llega aca y me meo");
		// adapt request to recipe query type
		RecipeQuery query = requestAdapter.adapt(request);
		// check if query is valid
		if (query == null) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("unable to get query term");
			// LOG ERROR
			return;
		}
		if(!query.isValid()) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("term is invalid only apha characters are allowed");
			// LOG ERROR
			return;
		}
		// query food/s by term
		List<Recipe> recipeList;
		
		// El getTerm() deberia devolver List<Food> ??? 
		recipeList = queryService.get(query.getTerm());
		// adapt the spots into a HTML JSON representation
		String recipesJson = recipeJsonAdapter.adapt(recipeList);
		// return as response
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_ACCEPTED);
		response.getWriter().write(recipesJson);
	}
}
