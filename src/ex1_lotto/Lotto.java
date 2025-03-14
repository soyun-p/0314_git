package ex1_lotto;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		
		// 1 ~ 45 사이의 중복되지 않는 난수 6개를 생성
		// 42 17 3 19 6 20 
		
		
		
		int[] lotto = new int[6];
		
		out:for(int i = 0; i < lotto.length;) {
			
			lotto[i] = new Random().nextInt(45) + 1;
			
			
			// 중복 체크를 위한 반복문
			for(int j = 0; j < i; j++) { 
			// j가 i보다 작아야 다음값을 비교할 때 인덱스 값의 오류가 없다. 
		    // j의 범위를 i의 범위와 같게 해놓으면 i++ 때문에 inner for문에서 마지막 j의 값을 lotto인덱스보다 초과해서 접근한다.
			// 따라서 i는 로또 번호를 하나 출력하고 난 후에 증가해야 하므로, i++의 위치는 로또번호 출력문 다음에 와야 한다.
				
				if( lotto[i] == lotto[j] ) {
					continue out;
				} // if
				
			} // for inner
			
			System.out.print(lotto[i] + " ");  // 중복 체크 후 로또 번호를 출력
			i++; // 로또 번호 출력 이후에 i 증가 : i++위치 중요!!
		
		} // for outer
		
		
	} // main

}
