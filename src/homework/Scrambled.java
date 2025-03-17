package homework;

import java.util.Random;

public class Scrambled {
	
	private String shake;
	
	public Scrambled() {
		
		shake = "";
	}
	
	
	// 정답을 섞어서 문제로 만드는 메서드
	public String getQuestion( String answer ) {
		
		// 정답()을 문자 단위로 끊어서 배열에 저장.
		int[] intArr = new int[ answer.length() ]; // 입력한 정답 길이만큼 배열 생성
		
		
		outer:for(int i = 0; i < intArr.length;) {
			intArr[i] = new Random().nextInt( answer.length() ); // 배열의 값을 정답의 길이만큼 랜덤으로 생성.
			
			for(int j = 0; j < i; j++) {  // 중복되는 인덱스 배제(로또 번호 참고)
				
				if( intArr[i] == intArr[j] ) {
					continue outer;
				} // if
	
			} // for inner
			
			i++;  // 로또 번호 참고
			
		} // for outer
		
		
		
		//만들어진 난수대로 정답 섞기
		for(int i = 0; i < intArr.length; i++) {
			
			shake += answer.charAt( intArr[i] );  // 배열의 인덱스 값에 따른 answer.char()을 shake에 차례대로 저장.
		} // for
		
	    return shake;  // shake 값을 main클래스로 리턴.
		
		
	} // getQuestion()
	
	
	
	
	
	

}
