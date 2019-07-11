/**
 * 
 */
package Models;

/**
 * @author lesco
 *
 */
public class Account {
	private int accNumber;
	private String Name;
	private String type;
	private int balance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accNumber, String name, String type, int balance) {
		super();
		this.accNumber = accNumber;
		Name = name;
		this.type = type;
		this.balance = balance;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + accNumber;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (accNumber != other.accNumber)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Account [Collection: " + accNumber + ", Character: " + Name + ", Type of Coins: " + type + ", Balance: " + balance + "]";
	}
	public String toTextFileString() {
		return accNumber + ":" + Name + ":" + type + ":" + balance;
	}
}
