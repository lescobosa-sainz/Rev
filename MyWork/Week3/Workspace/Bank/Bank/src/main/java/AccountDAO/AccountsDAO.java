package AccountDAO;

import java.io.FileNotFoundException;
import java.util.List;

import Models.Account;

public interface AccountsDAO {

	AccountsDAO currentImplementation = new AccountsDAOInMemory();

	void save(Account a);

	void remove(int index);

	List<Account> findAll();
	
	void writeNewBalanceDeposit(int acNumber,int amount);
	
	void writeNewBalanceWithdrawl(int acNumber,int amount);
	
	public int findByNumber(int acNumber);
	
	
	
	
}
