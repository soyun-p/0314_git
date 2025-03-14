package ex4_square_another;

import java.util.Scanner;

public class SquareMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("마방진의 크기 : ");
		int size = sc.nextInt();
		
		int[][] arr = new int[size][size];
		
		Square sq = new Square();
		sq.addNumber(arr);
		
		
		for(int i = 0; i < size; i++) {
			
			for(int j = 0; j < size; j++) {
				System.out.printf("%02d ", arr[i][j]);
				
			} // for inner
			
			System.out.println();
			
		} // for outer
		
	} // main

}
