package com.revature.e.Arrays;

import java.util.Arrays;

public class ArrayDriver {

	public static void main(String[] args) {

		int[] numbers = new int[10];
		numbers[0] = 13;
		numbers[1] = 53;

		numbers[8] = 105;
		
		

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("number at index:" + i + " = " + numbers[i]);

		}
		System.out.println(Arrays.toString(numbers));
	}

}
