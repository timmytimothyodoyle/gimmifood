package com.timmy.odoyle.gimmifood.test;

import com.timmy.odoyle.gimmifood.model.Categoria;
import com.timmy.odoyle.gimmifood.model.Difficulty;
import com.timmy.odoyle.gimmifood.model.Ingredient;
import com.timmy.odoyle.gimmifood.model.Instruccion;
import com.timmy.odoyle.gimmifood.model.Receta;
import com.timmy.odoyle.gimmifood.model.Utensillo;
import com.timmy.odoyle.gimmifood.model.adapter.ReceiptJsonAdapter;

public class AdapterTest {

	public static void main(String[] args) {
		Receta receta = new Receta("1", "Pastel de papa", Difficulty.FACIL);
		Ingredient papa = new Ingredient("1", "papa", Categoria.TUBERCULOS);
		Ingredient carne_picada = new Ingredient("2", "carne_picada", Categoria.CARNE);
		Ingredient queso = new Ingredient("3", "queso", Categoria.LACTEOS);
		receta.addIngrent(papa);
		receta.addIngrent(carne_picada);
		receta.addIngrent(queso);
		
		Utensillo fuente_horno = new Utensillo("1", "fuente_horno");
		
		Instruccion paso1 = new Instruccion("Hervi la papa");
		Instruccion paso2 = new Instruccion("Pisa la papa");
		Instruccion paso3 = new Instruccion("No se como hacer un pastel de papas");

		receta.addInstruccion(paso1);
		receta.addInstruccion(paso2);
		receta.addInstruccion(paso3);
		
		
		ReceiptJsonAdapter adapter = new ReceiptJsonAdapter();
		System.out.println(adapter.adapt(receta));
	}

}
