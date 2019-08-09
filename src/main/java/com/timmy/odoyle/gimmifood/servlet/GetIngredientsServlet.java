package com.timmy.odoyle.gimmifood.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonArray;
import com.timmy.odoyle.gimmifood.model.Ingredient;
import com.timmy.odoyle.gimmifood.model.adapter.IngredientJsonAdapter;
import com.timmy.odoyle.gimmifood.service.IngredientService;
import com.timmy.odoyle.gimmifood.service.impl.DefaultIngredientServiceImpl;

@WebServlet("/getingredients")
public class GetIngredientsServlet extends HttpServlet {

	private static final long serialVersionUID = 1554318495373326432L;

	private IngredientService service = new DefaultIngredientServiceImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get all ingredients from service
		Collection<Ingredient> ingredients = service.getAll();
		if (null == ingredients) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return;
		}
		// adapt collection of ingredients to json object
		JsonArray autocomplete = new IngredientJsonAdapter().adapt(ingredients);
		// set the response
		response.setContentType("application/json");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().write(autocomplete.toString());
	}
}