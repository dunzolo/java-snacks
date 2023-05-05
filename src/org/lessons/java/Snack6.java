package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class Snack6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un numeo limite");
		int max = sc.nextInt();
		
		System.out.println("Somma massima: " + max);
		int sum = 0;
		do {
			Random rnd = new Random();
			int num = rnd.nextInt(0,100);
			
			if(num < max) {
				sum += num;
				if(sum > max) {
					sum -= num;
					break;
				}
			}
			else {
				System.out.println("E' uscito un numero maggiore del limite scelto!");
				break;
			}
			
			
		} while (sum < max);
		System.out.println("Somma ottenuta: " + sum);
		
		sc.close();
	}
}
