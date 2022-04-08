package com.gestionepizzeria.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topping {
	private List<String> listaIngredienti;
	private double prezzo;

	public List<String> getListaIngredienti() {
		return listaIngredienti;
	}

	public Topping() {
		List<String> ingredienti = new ArrayList<>();
		ingredienti.add("Fior Di Latte");		
		this.listaIngredienti = ingredienti; 
		this.prezzo = 1.5;
	}

	public Topping(List<String> listaIngredienti, double prezzo) {
		this.listaIngredienti = listaIngredienti;
		this.prezzo = prezzo;
	}

	public void aggiungiToppingAPizza(Pizza pizza) {
		for (String s : listaIngredienti) {
			pizza.aggiungiIngrediente(s);
		}

		pizza.setPrezzo(pizza.getPrezzo() + this.prezzo);

	}

	public void setListaIngredienti(List<String> listaIngredienti) {
		this.listaIngredienti = listaIngredienti;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
}
