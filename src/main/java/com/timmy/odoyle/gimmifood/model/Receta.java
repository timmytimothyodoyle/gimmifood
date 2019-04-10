package com.timmy.odoyle.gimmifood.model;

import java.util.List;
import java.util.Map;

public class Receta {

	private String id;

	private String nombre;

	private Dificultad dificultad;

	private List<Instruccion> instrucciones;

	private Map<Ingrediente, String> ingredientes;

}
