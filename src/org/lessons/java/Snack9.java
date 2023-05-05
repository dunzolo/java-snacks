package org.lessons.java;

import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci la base");
		int b = sc.nextInt();
		
		System.out.println("Inserisci l'altezza");
		int h = sc.nextInt();
		
		sc.close();

		int area = b * h;
		int perimetro = ( b + h ) * 2;
		
		System.out.println("Area: " + area);
		System.out.println("Perimetro: " + perimetro);
	}
}
