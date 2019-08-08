package day04;

public class BankException extends RuntimeException{
	public BankException() {
		super("은행에서 예외발생!!");
		
	}
	
	public BankException(String msg) {
		super(msg);
		
	}
}
