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
//				System.out.println("프로그램 종료");
//				break;
//		
//			case 1:
//				System.out.print("계좌번호를 입력하세요:");
//				String account_number = sc.toString();
//				if(account_number == account.getnumber()) {
//					System.out.println("입금액 입력:");
//					int money = sc.nextInt();
//					bankbook.Deposit(money);
//					break;
//				}else {
//					System.out.println("계좌번호가 올바르지 않습니다.");
//					
//				}
//		 	
//		 	case 2:
//		 		System.out.println("출금액 입력:");
//		 		int money1 = sc.nextInt();
//		 		bankbook.Withdraw(money1);
//		 		break;
//		 		
//		 	case 3:
//		 		System.out.println("잔고확인");
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
