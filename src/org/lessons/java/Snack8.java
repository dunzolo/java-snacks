package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int num = -1;
		int indexPari = 0;
		int indexDispari = 0;
		Integer[] arrPari = new Integer[10];
		Integer[] arrDispari = new Integer[10];
		
		for(int i = 0; i < 10; i++) {
			num = rnd.nextInt(0, 100);
			
			if(num % 2 == 0) {
				arrPari[indexPari++] = num;			
			} else {
				arrDispari[indexDispari++] = num;
			}
		}
		System.out.println("Array pari: " + Arrays.toString(arrPari));
		System.out.println("Array dispari: " + Arrays.toString(arrDispari));
	}
}
