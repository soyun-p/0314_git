package ex4_square_another;

public class Square {

	public void addNumber( int[][] arr ) {  // 파라미터로 배열을 주면 복사본을 받는 것이기 때문에 값을 변경할 수 없다?

		int size = arr.length;
		int y = 0;
		int x = size / 2;
		int num = 1;


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
		
		
	
		

	} // addNumber()

}
