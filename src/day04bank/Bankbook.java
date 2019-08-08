package day04bank;

import java.util.Scanner;


public class Bankbook {
 //	private int balance;
//	private String name;
//	private String account_number = null;
	
	static AccountDAO dao = new AccountDAO();
	static Account account = new Account();
	static Bankbook bankbook = new Bankbook();

	
	public void Check() {
		System.out.println("���º���Ȯ�� y/n");
		Scanner sc = new Scanner(System.in);
		String check = sc.nextLine();
		
		if(check.equals("y"))
			Bankbook.menu();
		
		else if(check.equals("n")){
			System.out.println("���»����ϱ�");
			System.out.println("������ ���¹�ȣ�� �̸�, �ʱ� �Աݾ��� �Է����ּ���(1�� �̻�)");
			String num = sc.nextLine();
			String name = sc.nextLine();
			int bal = sc.nextInt();
			
			account.setnumber(num);
			account.setName(name);
			account.setBalance(bal);
			
//			System.out.println(dao.makeAccount(account));
			
			if(dao.makeAccount(account) == false) {
				System.out.println("���»����Ϸ�");
				Bankbook.menu();
			}
		}
		
		else {
			System.out.println("y or n���θ� �Է����ּ���");
		}
	}
	
	public static void menu() {
		
		System.out.println("�޴��� �������ּ���:");
		System.out.println("1�� : �Ա�");
		System.out.println("2�� : ���");
		System.out.println("3�� : �ܰ�Ȯ��");
		System.out.println("4�� : ���»���");
		System.out.println("0�� : ����");

		Scanner sc = new Scanner(System.in);
		int command = sc.nextInt();

		switch(command) {
			case 0:
				System.out.println("���α׷� ����");
				break;
		
			case 1:
				System.out.println("���¹�ȣ�� �Է��ϼ���:");
				String account_number = sc.nextLine();

				if(account_number.equals("111")) {
					System.out.println("�Աݾ� �Է�:");
					int money = sc.nextInt();
					bankbook.Deposit(money);
					break;
				}
				
				else {
					System.out.println("���¹�ȣ�� �ùٸ��� �ʽ��ϴ�.");
					break;
					
				}
		 	
		 	case 2:
		 		System.out.println("���¹�ȣ�� �Է��ϼ���:");
		 		String account_number1 = sc.nextLine();
		 		System.out.println();
		 		System.out.println("��ݾ� �Է�:");
		 		int money1 = sc.nextInt();
		 		bankbook.Withdraw(money1);
		 		break;
		 		
		 	case 3:
		 		System.out.println("�ܰ�Ȯ��");
		 		System.out.print("���¹�ȣ�� �Է��ϼ���:");
				String account_number2 = sc.nextLine();
		 		Account resultAccount = dao.getAccount(account_number2);
				System.out.println(account_number2);
		 		break;
		 	
		 	case 4:
		 		System.out.println("�������� ������");
		 		break;
		 }
		
		
	}
	
	public void Deposit(int money) {
		int bal = money + bal;
		account.setBalance(bal);
//		System.out.printf("%s���� ���� %s�� %d���� �ԱݵǾ����ϴ�.\n",name, account, money);
//		System.out.printf("���� �ܰ�� %d�� �Դϴ�.",balance);
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
