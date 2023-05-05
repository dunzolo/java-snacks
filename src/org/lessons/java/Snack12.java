package org.lessons.java;

import java.util.Arrays;

public class Snack12 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		// assegno al nuovo array una lunghezza calcolata dalla somma degli altri due
		int newArrLength = arr1.length + arr2.length;
		Integer[] arr3 = new Integer[newArrLength];
		
		// ciclo il primo array
		for(int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		
		// ciclo il secondo array e assegno a partire dall'ultima posizione occupata
		for(int i = 0; i < arr2.length; i++) {
			arr3[arr1.length + i] = arr2[i];
		}
		
		System.out.println(Arrays.asList(arr3));
	}
}
