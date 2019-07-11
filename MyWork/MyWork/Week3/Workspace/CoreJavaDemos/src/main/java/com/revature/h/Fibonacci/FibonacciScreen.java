package com.revature.h.Fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciScreen implements Screen {

	@Override
	public Screen run() {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number to get the Fibonacci Sequence");
		
		List<Integer> sequence =  new ArrayList<>();
		
		int input = scan.nextInt();
	
		sequence.add(0);
		sequence.add(1);
		
		
		int result;

		for (int i = 1; i < input ; i++) {
		
			result = sequence.get(sequence.size()-1) + sequence.get(sequence.size()-2);
			
			sequence.add(result);
			
		}
		
		
		System.out.println(sequence);
		
		System.out.println( sequence.get(sequence.size()-1) + " is the " + input +" number of the Fibonacci sequence");
		
		
		return new homeScreen();
	}

}
