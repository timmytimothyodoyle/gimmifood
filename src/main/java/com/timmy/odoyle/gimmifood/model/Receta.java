package com.timmy.odoyle.gimmifood.model;

import java.util.ArrayList;
import java.util.List;

public class Receta extends DefaultFood {

	private Difficulty difficulty;

	private List<Instruccion> instrucciones;

	private List<Ingredient> ingredientes;

	public Receta(String id, String name, Difficulty dificultad) {
		super(id, name);
		this.difficulty = dificultad;
		instrucciones = new ArrayList<Instruccion>();
		ingredientes = new ArrayList<Ingredient>();
	}

	public void addIngrent(Ingredient ingrediente) {
		this.ingredientes.add(ingrediente);
	}

	public void addInstruccion(Instruccion instruccion) {
		this.instrucciones.add(instruccion);
	}

}
