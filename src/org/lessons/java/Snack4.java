package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci una parola");
		String str = sc.nextLine();
		
		int lowIndex = 0;
		int upIndex = str.length()-1;
		boolean palindroma = true;
		
		// controllo i caratteri a partire dalla prima posizione fino a che gli indici non corripondono
		// l'indece minore lo incremento e quello maggiore lo decremento
		for (; lowIndex < upIndex; lowIndex++, upIndex--) {
			
			// recupero i caratteri
			char lowChar = str.charAt(lowIndex);
			char upChar = str.charAt(upIndex);
			
			if(lowChar != upChar) {
				palindroma = false;
				break;
			}
		}
		
		if(palindroma) {
			System.out.println("La parola è palindroma!");
		} else {
			System.out.println("La parola NON è palindroma!");
		}
		
		sc.close();
	}
}
