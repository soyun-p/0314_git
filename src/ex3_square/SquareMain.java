package ex3_square;

import java.util.Scanner;

public class SquareMain { // A 클래스
	public static void main(String[] args) {
		
		// 키보드에서 입력받은 홀수에 대한 마방진 출력
		// 08 01 06
		// 03 05 07
		// 04 09 02
		
		// 단, 키보드에서 입력받은 마방진 사이즈는 A.
		// 2차원 배열에 규칙대로 값을 넣는 코드는 B.
		// 배열에 담긴 결과를 출력하는 코드는 A.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마방진 크기 : ");
		int size = sc.nextInt();
		
		Square squ = new Square();
		int[][] res = squ.square(size);
		
		
		for(int i = 0; i < size; i++) {
			
			for(int j = 0; j < size; j++) {
				System.out.printf("%02d ", res[i][j]);
			} // for inner
			
			System.out.println();
		} // for outer
		
		
		
		
		
	} // main

}
