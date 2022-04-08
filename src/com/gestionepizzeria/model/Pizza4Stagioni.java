package com.gestionepizzeria.model;

import java.util.ArrayList;
import java.util.List;

public class Pizza4Stagioni extends Pizza {

	public Pizza4Stagioni() {
		this.setNome("4 Stagioni");
		this.setPrezzo(8.5);

		List<String> ingredienti = new ArrayList<>();
		ingredienti.add("Pomodoro");
		ingredienti.add("Mozzarella");
		ingredienti.add("Prosciutto");
		ingredienti.add("Funghi");
		ingredienti.add("Carciofi");
		this.setListaIngredienti(ingredienti);

	}
}
