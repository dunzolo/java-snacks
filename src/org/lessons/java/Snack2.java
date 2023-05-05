package org.lessons.java;

import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {
		// creo i due array di nomi e cognomi casuali
		String[] name = {"Davide", "Nicola", "Mattia", "Francesco", "Giovanni"};
		String[] surname = {"Rossi", "Bianchi", "Pippo", "Verdi", "Peperino"};
		
		String name_surname = null;
		
		for(int i = 0; i < name.length; i++) {
			//genera numeri casuale
			Random rndName = new Random();
			Random rndSurname = new Random();
			
			// tra parentesi indico il valore minimo e massimo
			int indexName = rndName.nextInt(0, name.length);
			int indexSurname = rndSurname.nextInt(0, surname.length);
			
			name_surname = name[indexName] + " " + surname[indexSurname];
			
			System.out.println(name_surname);
		}
	}
}
