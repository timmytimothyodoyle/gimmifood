package com.timmy.odoyle.gimmifood.search;

import org.apache.commons.lang3.StringUtils;

import com.timmy.odoyle.gimmifood.model.Category;

public class Query {

	private String query;

	private Category category;

	public Query() {
		// create and invalid query
	}

	public Query(String query, Category category) {
		this.query = query;
		this.category = category;
	}

	public boolean isValid() {
		return !StringUtils.isEmpty(query) || null != category;
	}

	public String getQuery() {
		return query;
	}

	public Category getCategory() {
		return category;
	}
}
