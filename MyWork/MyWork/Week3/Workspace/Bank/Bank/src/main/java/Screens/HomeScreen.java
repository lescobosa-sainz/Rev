package Screens;

import java.util.Scanner;

public class HomeScreen implements Screen {

	private Scanner scan = new Scanner(System.in);

	public Screen run() {

		System.out.println("Welcome to the Mushroom Kingdom Bank");
		
		String input;

		while (true) {
			System.out.println("Enter 1 to view your Collection");
			System.out.println("Enter 2 to to add or edit a Collection");

			input = scan.nextLine();

			switch (input) {
			case "1":
				return new ViewAccountsScreen();
			case "2":
				return new ManageAccountsScreen();
			default:
				System.out.println("You got hit by a shell, try again");
				break;
			}

		}

		
	}

}
