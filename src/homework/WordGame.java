package homework;

import java.util.Random;

public class WordGame {
	
	// 문제 보여주는 메서드
	public void showQuestion( String[] strArr ) {
		
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
		
		System.out.println();
		
		
	} // showQuestion
	
	
	
	
	
	// 입력한 값을 비교 후 정답인지 아닌지 출력하는 메서드
	public void wordGame( String answer ) {
		
		
		
		
		
		
		
		
		
	} // wordGame()

}
