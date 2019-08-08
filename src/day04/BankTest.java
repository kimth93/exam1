package day04;

import java.util.Scanner;

public class BankTest extends BankException {

	public static void main(String[] args) {
		
		System.out.println("계좌생성:");

		Bankbook bankbook = new Bankbook(50000,"kim","111-111");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("메뉴를 선택해주세요:");
		System.out.println("1번 : 입금");
		System.out.println("2번 : 출금");
		System.out.println("3번 : 거래내역확인");
		System.out.println("0번 : 종료");
		
		int command = scanner.nextInt();
		
		switch(command) {
			case 0:
				System.out.println("프로그램 종료");
				break;
		
			case 1:
		 		System.out.println("입금액 입력:");
		 		int money = scanner.nextInt();
		 		bankbook.Deposit(money);
		 		break;
		 	
		 	case 2:
		 		System.out.println("출금액 입력:");
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
