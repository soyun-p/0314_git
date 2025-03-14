package ex3_square;

public class Square {
	
	public int[][] square( int size ) { // int의 2차원 배열을 반환하려면 반환형도 그대로 써줘야 한다.
		
		int[][] arr = new int[size][size];
		
		int num = 0;
		int y = 0;
		int x =  size / 2;
		
		
		while( num <= size*size ) {
			
			arr[y][x] = num;
			
			
			if( num % size == 0 ) {
				y++;
			}else {
				y--;
				x++;
			} // if-else
			
			
			if( y < 0 ) {
				y = size - 1;
			}
			
			if( x >= size ) {
				x = 0;
				y--;
			}
			
			num++;
			
		} // while
		
		
		return arr;  // square클래스의 배열 값을 메인 클래스에 보내기 위해 return 사용.
		
		
		
		
		
		
	} // square()

}
