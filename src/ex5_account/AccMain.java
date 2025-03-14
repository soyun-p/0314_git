package ex5_account;

import java.util.Scanner;

public class AccMain {
	public static void main(String[] args) {
		
		// 1. 입  금
		// 2. 출  금
		// 3. 잔액확인
		// etc. 종료
		
		// >> 1
		// --- 입금 ---
		// 입금액 : 1000 (키보드)
		// 입급성공
		// -----------
		// 다시 메뉴 화면으로//>> 3
		// 잔액 : 1000
		// -----------
		// >> 2
		
		
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account();
		
		
		while( true ) {
			
			
			System.out.println("1. 입  금");
			System.out.println("2. 출  금");
			System.out.println("3. 잔액확인");
			System.out.println("etc. 종료");
			System.out.println(">> ");
			
			int select = sc.nextInt();
			
			
			switch( select ) {
			case 1: // 입금
				System.out.println("---입금---");
				System.out.print("입금액 : ");
				acc.deposit(sc.nextInt());  // 입금액 입력 
				// sc.nex
				break;
			
		    case 2: // 출금
		    	System.out.println("---출금---");
		    	System.out.print("출금액 : ");
		    	acc.withdraw(sc.nextInt()); // 출금액 입력
			    break;
			
		    case 3: // 잔액 확인
		    	System.out.println("잔액 : " + acc.balance() + "원");
		    	acc.balance();
			    break;
			
		    default: // 종료
		    	System.out.println("종료합니다.");
			    return;
		    } // switch
			
			System.out.println("------------------");
			
			
			
			
		}
		
		

		
		
		
		
		
		
		
	} // main

}
