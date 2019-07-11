package TxtFileReaderWriter;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import AccountDAO.AccountsDAO;
import Models.Account;

public class TxtFileWriteAccount {
	private List<Account> accounts;	
	private ArrayList<Account> list;
	private AccountsDAO accountDAO = AccountsDAO.currentImplementation;
	private Scanner scan = new Scanner(System.in);
	
	Account ac = new Account();

	public void justwrite() {
		ArrayList al = new ArrayList();

		for (Account a : accounts) {
			al.add(a.toTextFileString());
		}
		try {
			FileWriter fw = new FileWriter("accounts.txt", true);
			Writer output = new BufferedWriter(fw);
			int sz = al.size();
			for (int j = 0; j < sz; j++) {
				output.write(al.get(j).toString() + "\n");
			}
			output.close();
		}

		catch (Exception e) {
			System.out.println("Can not create file");
		}
	}

	

	public void justwriteAdd() {
		ArrayList al = new ArrayList();
		//ArrayList<Account> list1;

	//	list1 = new ArrayList<Account>();
	
		List<Account> accounts = accountDAO.findAll();
		for (Account a : accounts) {
			al.add(a.toTextFileString());
		}
		try {
			FileWriter fw = new FileWriter("accounts.txt", true);
			Writer output = new BufferedWriter(fw);
			int sz = al.size();
			for (int j = 0; j < sz; j++) {
				output.write(al.get(j).toString() + "\n");
			}
			output.close();
		}
		catch (Exception e) {
			System.out.println("Can not create file");
		}
	}

	
	public void ChangeBalanceWithdrawl(int acnumber, int amount) {
		accounts = accountDAO.findAll();
		for (Account ac : accounts) {
			if (acnumber == ac.getAccNumber()) {
				while(amount < 0 || amount > ac.getBalance()) {
					System.out.println(" Enter a valid amount ");
					amount =  Integer.parseInt(scan.nextLine());
				}
				ac.setBalance(ac.getBalance() - amount);
			}
		}
	}
	
	public void ChangeBalanceDeposit(int acnumber, int amount) {
		accounts = accountDAO.findAll();
		for (Account ac : accounts) {
			if (acnumber == ac.getAccNumber()) {
				ac.setBalance(ac.getBalance() + amount);
			}
			else {
				ac.setBalance(amount);
			}
		}
	}

	public void deleteSerialTxtFile() throws FileNotFoundException {
		PrintWriter writer = new PrintWriter("accounts.txt");
		writer.print("");
		writer.close();
	}

}
