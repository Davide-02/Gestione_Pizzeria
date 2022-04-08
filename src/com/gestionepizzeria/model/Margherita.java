package com.gestionepizzeria.model;

import java.util.ArrayList;
import java.util.List;

public class Margherita extends Pizza {

	public Margherita() {
		this.setNome("Margherita");
		this.setPrezzo(7.5);

		List<String> ingredienti = new ArrayList<>();
		ingredienti.add("Pomodoro");
		ingredienti.add("Bufala");
		ingredienti.add("Basilico");
		this.setListaIngredienti(ingredienti);
	}
}
