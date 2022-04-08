package com.gestionepizzeria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gestionepizzeria.model.Diavola;
import com.gestionepizzeria.model.Margherita;
import com.gestionepizzeria.model.Pizza;
import com.gestionepizzeria.model.Pizza4Stagioni;
import com.gestionepizzeria.model.Topping;

public class Main {

	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		List<Pizza> listaPizze = new ArrayList<Pizza>();

		double spesaTotale = 0.0;
		int numeroPizze;

		Scanner in = new Scanner(System.in);
		System.out.println("Quante pizze vuoi ordinare?");
		numeroPizze = Integer.parseInt(in.nextLine());

		for (int i = 0; i < numeroPizze; i++) {
			System.out.println("Che pizza vuoi?");
			String nomePizza = in.nextLine();

			
			switch (nomePizza) {
			case "margherita":
				pizza = new Margherita();
				break;

			case "4Stagioni":
				pizza = new Pizza4Stagioni();
				break;

			case "diavola":
				pizza = new Diavola();
				break;

			default:
				System.out.println("Pizza non trovata");
				break;

			

			}

			System.out.println("Vuoi aggiungere un topping? (s/n)");
			String scelta_topping = in.nextLine();

			switch (scelta_topping) {
			case "s":
				Topping topping = new Topping();

				topping.aggiungiToppingAPizza(pizza);
				break;
			}

			listaPizze.add(pizza);
			spesaTotale += pizza.getPrezzo(); 

		}
		
		System.out.println("Recap del tuo ordine: "); 
		for(Pizza p : listaPizze) {
			System.out.println(p); 
		}
		
		System.out.println("Per una spesa totale di: " + spesaTotale); 

	}

}
