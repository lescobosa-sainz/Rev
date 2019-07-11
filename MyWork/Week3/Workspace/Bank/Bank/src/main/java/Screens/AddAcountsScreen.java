package Screens;

import java.util.List;
import java.util.Scanner;

import AccountDAO.AccountsDAO;
import Models.Account;

public class AddAcountsScreen implements Screen {

	private Scanner scan = new Scanner(System.in);
	private AccountsDAO accountDAO = AccountsDAO.currentImplementation;

	@Override
	public Screen run() {

		int acNumber = 0, balance = 0;
		String name = "", type = "";

		List<Account> accounts = accountDAO.findAll();
		for (Account a : accounts) {
			System.out.println(a);
		}
		System.out.println("Enter Collection Number");
		acNumber = Integer.parseInt(scan.nextLine());

		System.out.println("Enter Character Name");
		name = scan.nextLine();

		System.out.println("Enter type of Account");
		type = scan.nextLine();

		System.out.println("Enter amount of coins");
		balance = Integer.parseInt(scan.nextLine());

		Account a = new Account(acNumber, name, type, balance);

		String option;

		System.out.println("Are you sure you want to create this Collection? y/n\n " + a);
		option = scan.nextLine();
		if (option.equals("y")) {
			accountDAO.save(a);

			accounts = accountDAO.findAll();
			for (Account b : accounts) {
				System.out.println(b);
			}
//		
		}
		return new ManageAccountsScreen();
	}
}
