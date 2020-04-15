package com.timmy.odoyle.gimmifood.model.adapter;

import java.util.List;

import com.timmy.odoyle.gimmifood.model.Item;

public interface ItemAdapter<T extends Item> {

	String adapt(T item);
	
	String adapt(List<T> items);
}
