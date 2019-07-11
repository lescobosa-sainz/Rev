package Screens;

import java.util.List;
import java.util.Scanner;

import AccountDAO.AccountsDAO;
import Models.Account;

public class ViewAccountsScreen implements Screen {

	private Scanner scan = new Scanner(System.in);
	private AccountsDAO accountDAO = AccountsDAO.currentImplementation;

	@Override
	public Screen run() {
		String input;

		List<Account> accounts = accountDAO.findAll();
		for (Account a : accounts) {
			System.out.println(a);
		}
		
		//while (true) {
				System.out.println("Enter 1 to add more coins to your Collection");
				System.out.println("Enter 2 to get coins from your Collections");
				System.out.println("Enter 3 Return to menu");

				input = scan.nextLine();

				switch (input) {
				case "1":
					return new DepositScreen();
				case "2":
					return new WithdrawlScreen();
				case "3":
					return new HomeScreen();
				default:
					System.out.println("You got hit by a shell, try again");
					break;
				}
		

			
		return new HomeScreen();
		}

}
