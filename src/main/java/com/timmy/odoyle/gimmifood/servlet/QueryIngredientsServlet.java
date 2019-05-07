package com.timmy.odoyle.gimmifood.servlet;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.timmy.odoyle.gimmifood.api.ItemAdapter;
import com.timmy.odoyle.gimmifood.model.Ingredient;
import com.timmy.odoyle.gimmifood.search.Query;
import com.timmy.odoyle.gimmifood.service.IngredientService;
import com.timmy.odoyle.gimmifood.service.impl.MockIngredientService;
import com.timmy.odoyle.gimmifood.servlet.adapter.IngredientsJsonAdapter;
import com.timmy.odoyle.gimmifood.servlet.adapter.ServletRequestQueryAdapter;

@WebServlet("/ingredients")
public class QueryIngredientsServlet extends HttpServlet {

	private static final long serialVersionUID = -2322603899485586071L;

	private IngredientService service;

	private ItemAdapter<HttpServletRequest, Query> queryAdapter;

	private ItemAdapter<List<Ingredient>, String> ingredientsAdapter;

	public QueryIngredientsServlet() {
		service = new MockIngredientService();
		queryAdapter = new ServletRequestQueryAdapter();
		ingredientsAdapter = new IngredientsJsonAdapter();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// adapt the http request into a query, and check if the query is valid,
		// if it isn't then set the response to bad request
		Query query = queryAdapter.adapt(request);
		if (!query.isValid()) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		// search for ingredients based on the query provided, if the response
		// is null or empty nothing was found
		List<Ingredient> ingredients = service.get(query);
		if (isEmpty(ingredients)) {
			response.setStatus(HttpServletResponse.SC_ACCEPTED);
			return;
		}

		// adapt the list of ingredients into a JSON string representation and add it
		// to the response
		String jsonResponse = ingredientsAdapter.adapt(ingredients);
		response.setContentType("application/json");
		response.setStatus(HttpServletResponse.SC_ACCEPTED);
		response.getWriter().write(jsonResponse);
	}
	
	/**
	 * Null-safe check if the specified collection is empty.
	 * <p>
	 * Null returns true.
	 * 
	 * @param coll  the collection to check, may be null
	 * @return true if empty or null
	 */
	public static boolean isEmpty(Collection<?> coll) {
	    return (coll == null || coll.isEmpty());
	}
}
