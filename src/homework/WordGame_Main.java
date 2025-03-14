package homework;

import java.util.Random;
import java.util.Scanner;

public class WordGame_Main {
	
	public static void main(String[] args) {
		
		String[] strArr = { "APPLE", "HOPE", "VIEW", "CHANGE" };
		
		// 문제 : PEALP  (랜덤으로 선택된 단어가 스펠링이 섞여서 출력.)
		// >>  ealpp
		// ealpp 오답...
		// >> apple
		// apple 정답!!
		
		/*
		int wr = new Random().nextInt(strArr.length) + 0;  // 단어 배열 중에 랜덤으로 하나 고르는 난수 발생
		
		String word = strArr[wr]; // 랜덤으로 고른 단어 저장.
		char[] wordArr = new char[strArr[wr].length()]; // 랜덤으로 단어 골라서 해당 단어의 크기만큼 배열 생성.
		
		String question = "";  // 단어의 char 배열을 저장할 공간
		
		
		
	    // 배열 내 중복되는 스펠링 배제하고 출력
		outer:for(int i = 0; i < wordArr.length;) {
			
			int n = new Random().nextInt(wordArr.length) + 0;
			
			
			for(int j = 0; j < i; j++) {
				
				if( word.charAt(n) == wordArr[j] ) {
					continue outer;
				} // if
				
			} // for inner
		
			wordArr[i] = word.charAt(n); // wordArr 배열에 단어 내의 스펠링을 랜덤으로 추출하여 배열에 저장.
			System.out.print(wordArr[i] + " ");
			i++;
			
		} // for outer
		
		System.out.println();   */
		
		WordGame wg = new WordGame();
		wg.showQuestion( strArr );
		
		
		Scanner sc = new Scanner(System.in);  
		
		System.out.println(">> ");
		String answer = sc.next();     // 정답 입력
		
		
		
		wg.wordGame( answer );  // 입력 값과 문제 비교 후 정답 출력하는 메서드 호출
		
		
		
		
		
		
	}

}
