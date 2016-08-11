package UMLExamples;

public class Customer {
	private int accountNo;
	private double balance;
	private String name;
	private static int count;

	public Customer() {
		this.accountNo = 0;
		this.balance = 0.0;
		this.name = "";
		Customer.count++;
	}

	public Customer(String name, int accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
		Customer.count++;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Customer.count = count;
	}

	public String toString() {
		return accountNo + " " + balance + " " + name;
	}

}
