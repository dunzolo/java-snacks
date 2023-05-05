package org.lessons.java;

import java.util.Random;

public class Snack7 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int num = -1;
		
		while (num % 3 != 0 || num % 5 != 0){
			
			num = rnd.nextInt(0,100);
			
			System.out.println(num);
			
		}
		
	}
}
