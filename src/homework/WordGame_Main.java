package homework;

import java.util.Random;
import java.util.Scanner;

public class WordGame_Main {
	
	public static void main(String[] args) {
		
		
		// 문제 : PEALP  (랜덤으로 선택된 단어가 스펠링이 섞여서 출력.)
		// >>  ealpp
		// ealpp 오답...
		// >> apple
		// apple 정답!!
		
		
		
		String[] strArr = { "APPLE", "HOPE", "VIEW", "CHANGE" };
		
		int idx = new Random().nextInt( strArr.length );  // 배열 내 난수 발생
		
		String answer = strArr[idx]; // 발생한 난수를 인덱스로 저장하여 answer에 저장

		
		Scrambled scr = new Scrambled();
		String question = scr.getQuestion( answer ); // getQuestion에 answer인자로 보내 메서드를 수행한 결과를 question에 저장.
		
		System.out.println("문제 : " + question);  // 문제 출력
		
		Scanner sc = new Scanner(System.in);
		
		
		while( true ) {
			
			System.out.print(">> ");
			String str = sc.next();   // 사용자에게 입력받은 정답
			
			if( str.equalsIgnoreCase(answer) ) { // 사용자에게 입력받은 정답과 정답이 같을 때
				System.out.println("정답!!");
				break;
			}else {
				System.out.println(str + "오답...");  // 오답 출력 후 다시 반복.
			}
		} // while
		
		
		
		
		
		
		
		
		
		
		
	}

}
