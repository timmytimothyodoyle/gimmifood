package com.timmy.odoyle.gimmifood.model.adapter;

import com.timmy.odoyle.gimmifood.model.GimmiFood;

public interface GimmiFoodAdapter<T extends GimmiFood>  {

	public String adapt(T f);
}
