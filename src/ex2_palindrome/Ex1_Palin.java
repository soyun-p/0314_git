package ex2_palindrome;

import java.util.Random;
import java.util.Scanner;

public class Ex1_Palin { // A 클래스
	public static void main(String[] args) {
		
		// 키보드에서 입력받은 값이 회문(수)인지 판단.
		// 단, 값을 입력받는 코드는 A, 입력받은 값으로 회문을 판단하는 코드는 B에서 작성.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		String str = sc.next();
		
		Palin pal = new Palin();
		pal.palin(str);
		
		
		
		
		
		
	} // main

}
