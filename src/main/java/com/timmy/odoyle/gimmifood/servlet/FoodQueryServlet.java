package com.timmy.odoyle.gimmifood.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.timmy.odoyle.gimmifood.model.adapter.FoodJsonAdapter;
import com.timmy.odoyle.gimmifood.model.adapter.ItemAdapter;
import com.timmy.odoyle.gimmifood.model.material.Food;
import com.timmy.odoyle.gimmifood.model.query.FoodQuery;
import com.timmy.odoyle.gimmifood.model.query.FoodQuery.QueryType;
import com.timmy.odoyle.gimmifood.service.FoodQueryService;
import com.timmy.odoyle.gimmifood.service.impl.MockFoodQueryService;
import com.timmy.odoyle.gimmifood.servlet.adapter.HttpRequestFoodQueryAdapter;

@WebServlet("/food")
public class FoodQueryServlet extends HttpServlet {

	private static final long serialVersionUID = 4284975867771304061L;

	private FoodQueryService queryService;

	private ItemAdapter<Food> foodJsonAdapter;

	private HttpRequestFoodQueryAdapter requestAdapter;
	
	public FoodQueryServlet() {
		queryService = new MockFoodQueryService();
		requestAdapter = new HttpRequestFoodQueryAdapter();		
		foodJsonAdapter = new FoodJsonAdapter();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// adapt request to food query type
		FoodQuery query = requestAdapter.adapt(request);
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
		List<Food> foodList;
		foodList = queryService.predict(query.getTerm());
		// adapt the spots into a HTML JSON representation
		String foodsJson = foodJsonAdapter.adapt(foodList);
		// return as response
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_ACCEPTED);
		response.getWriter().write(foodsJson);
	}
}
