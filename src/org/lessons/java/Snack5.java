package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un numero");
		int num = sc.nextInt();
		
		sc.close();
		
		int sum = 0;
		int sumPari = 0;
		int sumDispari = 0;
		double avg = 0;
		double avgDispari = 0;
		int min = 100;
		int max = 0;
		
		for (int i = 0; i < num; i++) {
			Random rnd = new Random();
			
			int rndNum = rnd.nextInt(0, 100);
			System.out.println(rndNum);
			
			sum += rndNum;
			
			if(rndNum % 2 == 0) {
				sumPari += rndNum;
			} else {
				sumDispari += rndNum;
			}
			
			if(rndNum < min) {
				min = rndNum;
			}
			
			if(rndNum > max) {
				max = rndNum;
			}
		}
		
		avg = (double) (sum / num);
		avgDispari = (double) (sumDispari / num);
		
		System.out.println("Somma totale: " + sum);
		System.out.println("Somma numeri pari: " + sumPari);
		System.out.println("Media totale: " + avg);
		System.out.println("Media numeri dispari: " + avgDispari);
		System.out.println("Il numero più piccolo è: " + min);
		System.out.println("Il numero più grande è: " + max);
	}
}
