package org.lessons.java;

import java.util.Scanner;

public class Snack10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il raggio");
		int r = sc.nextInt();
		
		
		sc.close();

		float area = r * r * 3.14f;
		float perimetro = r * 2 * 3.14f;
		
		System.out.println("Area: " + area);
		System.out.println("Perimetro: " + perimetro);
	}
}
