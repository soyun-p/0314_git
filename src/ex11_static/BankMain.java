package ex11_static;

public class BankMain {
	
	String s1 = "멤버변수";
	static String s2 = "스테틱변수";
	
	public static void main(String[] args) {
		// 스테틱 메서드 안에서 지역변수 형태로 정의되는 변수는 스테틱 형식이 아니어도 무방하다.
		int n = 100;
		
		// 스테틱 메서드 내부에서는 스테틱 변수만 접근이 가능
		// s1 = "abc";  :  
		s2 = "abc";
		
		
		Bank b1 = new Bank( "홍대", "02-111-1111" );
		Bank b2 = new Bank( "이대", "02-222-2222" );
		Bank b3 = new Bank( "서강대", "02-333-3333" );
		
		// b1.interest = 0.1f;   // 이대, 서강대는 같이 바뀌지 않고, 홍대만 이자율 바뀜. 객체가 별개로 동작하기 때문.
		
		// 스태틱 변수나 메서드는 프라이빗으로 하지 않고, '클래스 이름.static 변수' 구조로 만들어낸다.
		Bank.interest = 0.1f;  
		
		b1.information();
		b2.information();
		b3.information();
		
		
		
		
		
		
		
		
	} // main

}
