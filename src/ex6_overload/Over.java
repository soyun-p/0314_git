package ex6_overload;

public class Over {
	
	// 메서드의 오버로드 : 메서드의 '중복정의'
	// 하나의 클래스 내에서 같은 이름을 가진 메서드가 여러 개 정의되는 것.
	
	// 오버로딩의 규칙
	// 1. 인자의 수가 다른 경우
	// 2. 인자의 수가 같아도 타입(자료형)이 다른 경우
	// 3. 인자의 수와 타입이 같아도 순서가 다른 경우
	
	// 
	
	public void result() {
		System.out.println("인자가 없는 메서드");	
	} // result()
	
	
	
	// 메서드 이름이 똑같으면 jvm은 인식 오류를 일으킨다. 다만
	public void result( int n ) {
		System.out.println("정수를 인자로 받는 메서드");	
	} 
	
	
	
	public void result( char n ) {
		System.out.println("문자를 인자로 받는 메서드");
	}
	
	
	
	public void result( int n, String s) {
		System.out.println("정수, 문자열을 인자로 받는 메서드");
	}
	
	
	
	public void result( String s, int n ) {
		System.out.println("문자열, 정수를 인자로 받는 메서드");
	}
	
	
	
	
	

}
