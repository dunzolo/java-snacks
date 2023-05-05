package org.lessons.java;

import java.util.Arrays;

public class Snack13 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		Integer[] new_arr1 = new Integer [arr1.length];
		Integer[] new_arr2 = new Integer [arr2.length];
		
		int temp = arr1[0];
		new_arr1[0] = arr2[0];
		new_arr2[0] = temp;
		
		for(int i = 1; i < arr1.length; i++) {
			new_arr1[i] = arr1[i]; 
		}
		
		System.out.println(Arrays.asList(new_arr1));
		
		for(int i = 1; i < arr2.length; i++) {
			new_arr2[i] = arr2[i]; 
		}
		
		System.out.println(Arrays.asList(new_arr2));
	}
}
