package com.timmy.odoyle.gimmifood.api;

public interface ItemAdapter<E, T> {

	T adapt(E item);
}
