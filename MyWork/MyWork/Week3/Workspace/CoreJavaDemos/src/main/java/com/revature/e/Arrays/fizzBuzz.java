package com.revature.e.Arrays;

import java.util.Arrays;

public class fizzBuzz {

	public static Object[] solution(Object[] input) {

		Object[] result = new Object[input.length];

		for (int i = 0; i < input.length; i++) {

			int j = (Integer) input[i];

			if (j % 3 == 0 && j != 0) {
				input[i] = "fizz";

			}

			if (j % 5 == 0 && j != 0) {
				input[i] = "buzz";

			}
			if ((j % 3 == 0 && j != 0) && (j % 5 == 0)) {
				input[i] = "fizzbuzz";

			}

		}
		//System.out.println(Arrays.toString(input));
	
	return result;
		
	}

	
	
	
	public static void main(String[] args) {

		Object[] fizzBuzz = new Object[100];

		for (int i = 0; i < fizzBuzz.length; i++) {
			fizzBuzz[i] = i;

		}
		System.out.println(Arrays.toString(fizzBuzz));
		Object[] solved = solution(fizzBuzz);
		System.out.println(Arrays.toString(fizzBuzz));

	}

}
