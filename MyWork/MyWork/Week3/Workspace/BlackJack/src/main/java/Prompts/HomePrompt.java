package Prompts;

import java.util.List;
import java.util.Scanner;

import CardDao.CardDAO;
import CardDao.CardDAOInMemory;
import Models.Card;

public class HomePrompt implements Prompt {

	private CardDAO cardDAO = CardDAO.currentImplementation;

	private Scanner scan = new Scanner(System.in);

	@Override
	public Prompt run() {

		String input;

		while (true) {
			System.out.println("Enter 1 to view available cards.");

			input = scan.nextLine();
			switch (input) {
			case "1":
				return new CardsPrompt();

			default:
				System.out.println("Did not understand that selection, try again");
				break;
			}

			return new HomePrompt();
		}
	}
}
