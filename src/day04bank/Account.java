package day04bank;

public class Account {
	private String number;
	private String name;
	private int balance;
	
	public String getnumber() {
		return number;
	}
	public void setnumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [account_number=" + number + ", name=" + name + ", balance=" + balance + "]";
	}
	
	

}
