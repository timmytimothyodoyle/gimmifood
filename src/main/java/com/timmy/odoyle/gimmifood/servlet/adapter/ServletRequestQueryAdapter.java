package com.timmy.odoyle.gimmifood.servlet.adapter;

import javax.servlet.http.HttpServletRequest;

import com.timmy.odoyle.gimmifood.api.ItemAdapter;
import com.timmy.odoyle.gimmifood.model.Category;
import com.timmy.odoyle.gimmifood.search.Query;

public class ServletRequestQueryAdapter implements ItemAdapter<HttpServletRequest, Query> {

	public Query adapt(HttpServletRequest request) {
		return new Query(request.getParameter("query"), Category.getById(request.getParameter("category")));
	}

}
