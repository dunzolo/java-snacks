package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un numero");
		int num = sc.nextInt();
		
		sc.close();
		
		if(num % 2 == 0) {
			System.out.println("Num: " + num);
		} else {
			num += 1;
			System.out.println("Num: " + num);
		}
	}
}
