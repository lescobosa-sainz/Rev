package com.revature.e.Arrays;

import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 8, 2, 93, 5 };
		int[] numbersReverse = new int[5];

		System.out.println(Arrays.toString(numbers));
		int j = numbers.length;
		for (int i = 0; i < numbersReverse.length; i++) {
			numbersReverse[i] = numbers[j - 1];
			j--;

		}

		System.out.println(Arrays.toString(numbersReverse));
	}

}
