package com.revature.g.crash;

public class StackOverflow {

	public static void main(String[] args) {

		crash();

	}

	private static void crash() {
		crash();
	}

}
