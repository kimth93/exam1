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
		//list�� ����
		
		
	}
	
	public void Deposit(int money) {
		balance = money + balance;
		System.out.printf("%s���� ���� %s�� %d���� �ԱݵǾ����ϴ�.\n",name, account, money);
		System.out.printf("���� �ܰ�� %d�� �Դϴ�.",balance);
	}
	
	public void Withdraw(int money) {		
		if(balance < money) {
			System.out.printf("�����ܾ� ���� ��ݾ��� �� �����ϴ�.\n�����ܰ� : %d",balance);
		}
		else {
			balance = balance - money;
			System.out.printf("%s���� ���� %s���� %d���� ����߽��ϴ�.", name, account, money);
			System.out.printf("���� �ܰ�� %d�� �Դϴ�.\n", balance);
		}
	}
	
}
