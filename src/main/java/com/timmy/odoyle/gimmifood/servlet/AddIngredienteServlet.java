package com.timmy.odoyle.gimmifood.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ingrediente")
public class AddIngredienteServlet extends HttpServlet {

	private static final long serialVersionUID = -2322603899485586071L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("yoquese");
		System.out.println(request.getParameter("action"));
	}

}
