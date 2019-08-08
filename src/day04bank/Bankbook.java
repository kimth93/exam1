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
		System.out.println("계좌보유확인 y/n");
		Scanner sc = new Scanner(System.in);
		String check = sc.nextLine();
		
		if(check.equals("y"))
			Bankbook.menu();
		
		else if(check.equals("n")){
			System.out.println("계좌생성하기");
			System.out.println("생성할 계좌번호와 이름, 초기 입금액을 입력해주세요(1원 이상)");
			String num = sc.nextLine();
			String name = sc.nextLine();
			int bal = sc.nextInt();
			
			account.setnumber(num);
			account.setName(name);
			account.setBalance(bal);
			
//			System.out.println(dao.makeAccount(account));
			
			if(dao.makeAccount(account) == false) {
				System.out.println("계좌생성완료");
				Bankbook.menu();
			}
		}
		
		else {
			System.out.println("y or n으로만 입력해주세요");
		}
	}
	
	public static void menu() {
		
		System.out.println("메뉴를 선택해주세요:");
		System.out.println("1번 : 입금");
		System.out.println("2번 : 출금");
		System.out.println("3번 : 잔고확인");
		System.out.println("4번 : 계좌삭제");
		System.out.println("0번 : 종료");

		Scanner sc = new Scanner(System.in);
		int command = sc.nextInt();

		switch(command) {
			case 0:
				System.out.println("프로그램 종료");
				break;
		
			case 1:
				System.out.println("계좌번호를 입력하세요:");
				String account_number = sc.nextLine();

				if(account_number.equals("111")) {
					System.out.println("입금액 입력:");
					int money = sc.nextInt();
					bankbook.Deposit(money);
					break;
				}
				
				else {
					System.out.println("계좌번호가 올바르지 않습니다.");
					break;
					
				}
		 	
		 	case 2:
		 		System.out.println("계좌번호를 입력하세요:");
		 		String account_number1 = sc.nextLine();
		 		System.out.println();
		 		System.out.println("출금액 입력:");
		 		int money1 = sc.nextInt();
		 		bankbook.Withdraw(money1);
		 		break;
		 		
		 	case 3:
		 		System.out.println("잔고확인");
		 		System.out.print("계좌번호를 입력하세요:");
				String account_number2 = sc.nextLine();
		 		Account resultAccount = dao.getAccount(account_number2);
				System.out.println(account_number2);
		 		break;
		 	
		 	case 4:
		 		System.out.println("은행으로 가세요");
		 		break;
		 }
		
		
	}
	
	public void Deposit(int money) {
		int bal = money + bal;
		account.setBalance(bal);
//		System.out.printf("%s님의 계좌 %s에 %d원이 입금되었습니다.\n",name, account, money);
//		System.out.printf("통잔 잔고는 %d원 입니다.",balance);
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
