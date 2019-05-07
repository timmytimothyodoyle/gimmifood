package com.timmy.odoyle.gimmifood.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/recipes")
public class QueryRecipesServlet extends HttpServlet {

	private static final long serialVersionUID = -8763965389979336980L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] ingredients = request.getParameterValues("ingredients[]");

		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_ACCEPTED);
		response.getWriter().write(String.join(",", ingredients));
	}

}
