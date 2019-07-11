package com.revature.h.Fibonacci;

import java.util.Scanner;

public class homeScreen implements Screen {

	private Scanner scan = new Scanner(System.in);

	public Screen run() {
		String input;

		while (true) {
			System.out.println("Enter 1 To do the Fibonacci Sequences ");
			System.out.println("Enter 2 to do the Factorial Sequence");

			input = scan.nextLine();

			switch (input) {
			case "1":
				return new FibonacciScreen();
				
			
			case "2":
				
				return new FactorialScreen();
				
			default:
				System.out.println("Did not understand selection, try again");
				break;
			}

		}

	}

}
