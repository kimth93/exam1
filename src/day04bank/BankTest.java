package day04bank;

import java.util.Scanner;

public class BankTest extends BankException {

	public static void main(String[] args) {
		
		AccountDAO dao = new AccountDAO();
		Account account = new Account();
		Bankbook bankbook = new Bankbook();
		Scanner sc = new Scanner(System.in);
		
		bankbook.Check();
		//bankbook.menu();
		int command = sc.nextInt();
		
//		switch(command) {
//			case 0:
//				System.out.println("���α׷� ����");
//				break;
//		
//			case 1:
//				System.out.print("���¹�ȣ�� �Է��ϼ���:");
//				String account_number = sc.toString();
//				if(account_number == account.getnumber()) {
//					System.out.println("�Աݾ� �Է�:");
//					int money = sc.nextInt();
//					bankbook.Deposit(money);
//					break;
//				}else {
//					System.out.println("���¹�ȣ�� �ùٸ��� �ʽ��ϴ�.");
//					
//				}
//		 	
//		 	case 2:
//		 		System.out.println("��ݾ� �Է�:");
//		 		int money1 = sc.nextInt();
//		 		bankbook.Withdraw(money1);
//		 		break;
//		 		
//		 	case 3:
//		 		System.out.println("�ܰ�Ȯ��");
//		 		break;
//		 }
		
		 
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
