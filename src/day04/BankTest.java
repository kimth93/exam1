package day04;

import java.util.Scanner;

public class BankTest extends BankException {

	public static void main(String[] args) {
		
		System.out.println("���»���:");

		Bankbook bankbook = new Bankbook(50000,"kim","111-111");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�޴��� �������ּ���:");
		System.out.println("1�� : �Ա�");
		System.out.println("2�� : ���");
		System.out.println("3�� : �ŷ�����Ȯ��");
		System.out.println("0�� : ����");
		
		int command = scanner.nextInt();
		
		switch(command) {
			case 0:
				System.out.println("���α׷� ����");
				break;
		
			case 1:
		 		System.out.println("�Աݾ� �Է�:");
		 		int money = scanner.nextInt();
		 		bankbook.Deposit(money);
		 		break;
		 	
		 	case 2:
		 		System.out.println("��ݾ� �Է�:");
		 		int money1 = scanner.nextInt();
		 		bankbook.Withdraw(money1);
		 		break;
		 }
		
		 
//		try {
//			bankbook.Withdraw(40000);
//			bankbook.Deposit(10000);
//			bankbook.Withdraw(50000);
//			
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		
	}

}
