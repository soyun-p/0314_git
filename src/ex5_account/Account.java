package ex5_account;

import java.util.Scanner;

public class Account {

	private int money;  // <= this.money


	public void deposit( int money ) { // 입금
		this.money += money;     // 입력한 돈(money)을 this.money(입금액을 저장할 공간)에 저장.
		System.out.println("입금 성공!");

	} // deposit()



	public int withdraw( int money ) {  // 출금

		if( this.money - money < 0 ) { 
			System.out.println("잔액부족");
			return money;                  // 출금 실패
		}else{
			this.money -= money;      // 출금할 돈(money)을 this.money(입금액을 저장한 공간)에서 빼가는 코드.
			System.out.println("출금 성공!");
			return money;
		}


	} // withdraw()



	public int balance() {  // 잔액확인 : 파라미터가 필요하지 않다.
		System.out.println();
		return money;

	} // balance()

}
