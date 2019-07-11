package com.revature.h.Fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorialScreen implements Screen {

	@Override
	public Screen run() {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("enter a number to get its factorial");
		
		List<Integer> sequence =  new ArrayList<>();
		
		
		
		int input;
		input = Integer.parseInt(scan.nextLine());
		
		
		int factor, originalFactor, result;

		

		result = input;
		originalFactor = input;

		for (int i = input - 1; i != 0; i--) {
			int previousResault = result;
			result = result * i;

			if (input == originalFactor) {
				System.out.println((originalFactor) + " * " + i + " = " + result);
			} else {
				System.out.println(previousResault + " * " + i + " = " + result);
			}

			input--;
			
			
		}
		return new homeScreen();
	}

}
