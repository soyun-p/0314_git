package ex7_overload;

public class Bread {
	
	public void makeBread() {
		// method - 1
		System.out.println("빵을 만들었습니다");
		System.out.println("---------------------");
		
	} 
	
	
	
	public void makeBread( int n ) {
		// method - 2
		
		for(int i = 0; i < n; i++) {
			System.out.println("빵을 만들었습니다");
		}
		
		System.out.printf("요청하신 %d개의 빵을 만들었습니다\n", n);
		System.out.println("---------------------");
		
	} 
	
	
	
	public void makeBread( int n, String s) {
		// method - 3
		
		for(int i = 0; i < n; i++) {
			System.out.println("빵을 만들었습니다");
		}
		
		System.out.printf("요청하신 %d개의 %s을 만들었습니다\n", n, s);
		System.out.println("---------------------");
		
	} 

	
	
	
	
	
	
}
