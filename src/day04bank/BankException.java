package day04bank;

public class BankException extends RuntimeException{
	public BankException() {
		super("���࿡�� ���ܹ߻�!!");
		
	}
	
	public BankException(String msg) {
		super(msg);
		
	}
}
