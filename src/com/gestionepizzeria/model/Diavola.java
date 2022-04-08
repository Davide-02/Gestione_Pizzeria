package com.gestionepizzeria.model;

import java.util.ArrayList;
import java.util.List;

public class Diavola extends Pizza {
	
	
	public Diavola() {
		this.setNome("Diavola");
		this.setPrezzo(7);
		
		List<String> ingredienti = new ArrayList<>();
		ingredienti.add("Pomodoro");
		ingredienti.add("Bufala");
		ingredienti.add("Nduja");
		ingredienti.add("Peperoncino");

		this.setListaIngredienti(ingredienti);
	}
}
