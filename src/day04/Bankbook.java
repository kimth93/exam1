package day04;

public class Bankbook {
	private int balance;
	private String name;
	private String account;
	
	public Bankbook(int balance, String name, String account) {
		this.balance = balance;
		this.account = account;
		this.name = name;
	}
	
	public void MakeAccount(int balance,String name, String account) {
		//list에 저장
		
		
	}
	
	public void Deposit(int money) {
		balance = money + balance;
		System.out.printf("%s님의 계좌 %s에 %d원이 입금되었습니다.\n",name, account, money);
		System.out.printf("통잔 잔고는 %d원 입니다.",balance);
	}
	
	public void Withdraw(int money) {		
		if(balance < money) {
			System.out.printf("통잔잔액 보다 출금액이 더 많습니다.\n통장잔고 : %d",balance);
		}
		else {
			balance = balance - money;
			System.out.printf("%s님의 계좌 %s에서 %d원을 출금했습니다.", name, account, money);
			System.out.printf("남은 잔고는 %d원 입니다.\n", balance);
		}
	}
	
}
