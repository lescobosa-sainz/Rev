package AccountDAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Models.Account;
import TxtFileReaderWriter.TxtFileReadAccount;
import TxtFileReaderWriter.TxtFileWriteAccount;

public class AccountsDAOInMemory implements AccountsDAO {
	private List<Account> accounts;
	public AccountsDAOInMemory() {
		TxtFileReadAccount reader = new TxtFileReadAccount();
		reader.readAccountFile();
		accounts = reader.getAccounts();
	}
	@Override
	public void save(Account a) {
		TxtFileWriteAccount writer = new TxtFileWriteAccount();
		accounts.add(a);
		try {
			writer.deleteSerialTxtFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		writer.justwriteAdd();
	}
	@Override
	public void remove(int index) {
		TxtFileWriteAccount writer = new TxtFileWriteAccount();
		accounts.remove(index);
		try {
			writer.deleteSerialTxtFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		writer.justwriteAdd();
	}
	@Override
	public List<Account> findAll() {
		return accounts;
	}
	@Override
	public void writeNewBalanceDeposit(int acNumber, int amount) {
		TxtFileWriteAccount writer = new TxtFileWriteAccount();
		writer.ChangeBalanceDeposit(acNumber, amount);
		try {
			writer.deleteSerialTxtFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		writer.justwrite();
	}
	@Override
	public void writeNewBalanceWithdrawl(int acNumber, int amount) {
		TxtFileWriteAccount writer = new TxtFileWriteAccount();
		writer.ChangeBalanceWithdrawl(acNumber, amount);
		try {
			writer.deleteSerialTxtFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		writer.justwrite();
	}
	public static int index = 0;
	@Override
	public int findByNumber(int acNumber) {
		int i = 0;
		for (Account a : accounts) {
			int num = a.getAccNumber();
			if (num == acNumber) {
				index = i;
			}
			i++;
		}

		return index;
	}
}
