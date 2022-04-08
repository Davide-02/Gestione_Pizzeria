package com.gestionepizzeria.model;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private String nome;
	private double prezzo;
	private List<String> listaIngredienti;

	public Pizza() {

	}

	public Pizza(String nome, double prezzo, List<String> listaIngredienti) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.listaIngredienti = new ArrayList<>();
	}

	public void aggiungiIngrediente(String ingrediente) {
		this.listaIngredienti.add(ingrediente);
	}

	public void aggiungiIngrediente(String ingrediente, double prezzo) {
		this.listaIngredienti.add(ingrediente);
		this.prezzo = prezzo;
	}

	public void rimuoviIngrediente(String ingrediente) {
		this.listaIngredienti.remove(ingrediente);
	}

	public void rimuoviIngrediente(String ingrediente, double prezzo) {
		this.listaIngredienti.remove(ingrediente);
		this.prezzo = prezzo;
	}

	public void stampaDescrizione() {
		System.out.println("Pizza generica");
	}

	@Override
	public String toString() {
		String testo = "";

		testo += "Pizza " + this.nome + ". Ingredienti: ";

//		Ciclo for alternativo al for-each di riga successiva
//		for (int i = 0; i < listaIngredienti.size(); i++) {
//			testo += listaIngredienti.get(i) + " ";
//		}

		for (String s : listaIngredienti) {
			testo += s + " ";
		}

		return testo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public List<String> getListaIngredienti() {
		return listaIngredienti;
	}

	public void setListaIngredienti(List<String> listaIngredienti) {
		this.listaIngredienti = listaIngredienti;
	}

}
