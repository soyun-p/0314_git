package ex7_overload;

import java.util.Scanner;

public class BreadMain {
	public static void main(String[] args) {
		
		// 빵을 만들었습니다  <-- 메서드 1을 호출한 결과
		
		// 빵을 만들었습니다
		// 빵을 만들었습니다
		// 요청하신 2개의 빵을 만들었습니다  <-- 메서드 2를 호출한 결과
		
		// 크림빵을 만들었습니다.
		// 크림빵을 만들었습니다.
		// 요청하신 2개의 크림빵을 만들었습니다  <-- 메서드 3을 호출한 결과
		
		
		Bread br = new Bread();
		
		
		br.makeBread();
		br.makeBread(2);
		br.makeBread(3, "팥빵");
		
		
		
		
	} // main

}
