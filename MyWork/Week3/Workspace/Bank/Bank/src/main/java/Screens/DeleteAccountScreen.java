package Screens;

import java.util.List;
import java.util.Scanner;

import AccountDAO.AccountsDAO;
import AccountDAO.AccountsDAOInMemory;
import Models.Account;

public class DeleteAccountScreen implements Screen {

	private Scanner scan = new Scanner(System.in);
	private AccountsDAO accountDAO = AccountsDAO.currentImplementation;

	
	
	@Override
	public Screen run() {
		
		int input = 0, input1;
		String inputString, inputString1;
		Boolean isint = true;
		Boolean Sc = false;
		
		List<Account> accounts = accountDAO.findAll();
		for (Account a : accounts) {
			System.out.println(a);
		}
		
		while (isint) {

			System.out.println("Enter Collection Number");
			inputString = scan.nextLine();
			Sc = isNumeric(inputString);

			if (Sc) {
				input = Integer.parseInt(inputString);

				isint = (input > 0) ? false : true;

			} else {
				System.out.print("You got hit by a shell\n");
				isint = true;
			}
		}
		
		for (Account a : accounts) {
			System.out.println(a);
		}
		
		accountDAO.findByNumber(input);
		
		accountDAO.remove(AccountsDAOInMemory.index);
		

		
		for (Account a : accounts) {
			System.out.println(a);
		}
		
		
		return new ManageAccountsScreen();
	}
	
	public static boolean isNumeric(String strNum) {
		return strNum.matches("-?\\d+(\\.\\d+)?");
	}
	
	
	

}
