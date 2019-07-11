package com.revature.h.Fibonacci;

public class fibonacciDriver {

	public static void main(String[] args) {
		Screen currentScreen = new homeScreen();
		
		while(true) {
			currentScreen = currentScreen.run();
		}

	}

}
