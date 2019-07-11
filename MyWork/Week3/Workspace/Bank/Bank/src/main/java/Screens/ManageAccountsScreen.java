package Screens;

import java.util.Scanner;

public class ManageAccountsScreen implements Screen {

	private Scanner scan = new Scanner(System.in);

	@Override
	public Screen run() {

		String input;

		while (true) {
			System.out.println("Enter 1 to add a new Collection");
			System.out.println("Enter 2 to delete a Collection");
			System.out.println("Enter 3 Return to menu");

			input = scan.nextLine();

			switch (input) {
			case "1":
				return new AddAcountsScreen();
			case "2":
				return new DeleteAccountScreen();
			case "3":
				return new HomeScreen();
			default:
				System.out.println("You got hit by a shell, try again");
				break;
			}

		}

	}

}
