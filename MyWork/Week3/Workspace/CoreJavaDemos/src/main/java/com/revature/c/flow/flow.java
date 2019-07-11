package com.revature.c.flow;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class flow {

	public static void main(String[] args) {
	//	ifDemo(7);
	//	switchDemo(3);
		
		
	//	System.out.println(average(8,9,10));
	//	double result = average(1,2,3);
		//System.out.println(result);
		
		//forDemo(10);
		
		//whileDemo();
		
		dowhileDemo();
		
	}
	
	
	public static void dowhileDemo() {
		
		Scanner scan = new Scanner(System.in);
		String input;
		
		do {
			System.out.println("enter something");
			input = scan.nextLine();
		}while(!input.equals("done"));
		
	}
	
	
	public static void whileDemo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter something");
		String input = scan.nextLine();
		
		while(!input.equals ("done")) {
			System.out.println("pleaase try agai: ");
			input = scan.nextLine();
		}
		
		System.out.println("congrats you figured out");
	}
	
	
	/***
	 * for loop example that will iterate according to the condition
	 * @param num
	 */
	
	public static void forDemo(int num) {
		for (int i=0; i < num; i++) {
			// contains code inside of the for will repeat until the condition
			//evaluates to false
			System.out.println("iteration i = " + i);
		}
	}
	
	
	/***
	 * a method to compute and return the average
	 * @param one
	 * @param two
	 * @param three
	 * @return
	 */
		public static double average (int one, int two, int three){
			int sum = one + two+ three;
				double avg = sum/3;
			return avg;
		
		}

	public static void ifDemo(int i){	
		
				
		if (i== 5 || i == 3) {
			System.out.println("i is 5 or 3");
		}
		else if (i > 100) {
			System.out.println("i is over 100");
		}
		else {
			System.out.println("i is not 5 or and less than 500");
		}
	}
	
	public static void switchDemo(int i) {
		switch (i) {
		case 1:
			System.out.println("case 1 do something");
			break;
			
		case 2:
			System.out.println("case 2 do something");
			break;
			
		case 3:
			System.out.println("case 3 do something");
			break;
			
			default:
				System.out.println("default case");
				
				break;
			
					}
	}
	
}




