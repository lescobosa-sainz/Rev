package Screens;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import AccountDAO.AccountsDAO;
import Models.Account;

public class DepositScreen implements Screen {

	private Scanner scan = new Scanner(System.in);
	private AccountsDAO accountDAO = AccountsDAO.currentImplementation;

	@Override
	public Screen run() {
		int input = 0, input1;
		String inputString, inputString1;
		Boolean isint = true;
		Boolean Sc = false;

		while (isint) {

			System.out.println("How much coins do you want to put in your collection");
			inputString = scan.nextLine();
			Sc = isNumeric(inputString);

			if (Sc) {
				input = Integer.parseInt(inputString);

				isint = (input > 0) ? false : true;

			} else {
				System.out.print("You got hit by a shell \n");
				isint = true;
			}
		}

		List<Account> accounts = accountDAO.findAll();
		for (Account a : accounts) {
			System.out.println(a);
		}

		System.out.println("Please select a Collection");
		inputString1 = scan.nextLine();

		input1 = Integer.parseInt(inputString1);

		accountDAO.writeNewBalanceDeposit(input1, input);

		return new ViewAccountsScreen();

	}

	public static boolean isNumeric(String strNum) {
		return strNum.matches("-?\\d+(\\.\\d+)?");
	}

}
