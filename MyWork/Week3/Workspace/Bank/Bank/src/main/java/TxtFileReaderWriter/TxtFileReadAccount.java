package TxtFileReaderWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import Models.Account;

public class TxtFileReadAccount {	
	private List<Account> accounts;
	File accountsFile = new File("accounts.txt");
	
	public void createFile() throws IOException {

		if (!accountsFile.exists()) {
			accountsFile.createNewFile();
		}
	}

	public void readAccountFile() {

		try {
			createFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String a = ":";

		File fileName = new File("accounts.txt");

		accounts = new LinkedList<>();

		String line;
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));

			while ((line = br.readLine()) != null) {
				String[] temp = line.split(a);

				accounts.add(new Account(Integer.parseInt(temp[0]), (temp[1]), (temp[2]), Integer.parseInt(temp[3])));

			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Account> getAccounts() {
		return accounts;
	}
	
	public void setBalance(List<Account> accounts) {
		this.accounts = accounts;
	}

}
