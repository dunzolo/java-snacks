package org.lessons.java;

import java.util.Scanner;

public class Snack11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Inserisci un numero intero positivo: ");
        int n = sc.nextInt();
        
        sc.close();
        
        System.out.print("I divisori di " + n + " sono: ");
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
	}
}
