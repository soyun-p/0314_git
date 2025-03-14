package ex11_static;

public class Bank {
	
	// static으로 선언한 이자율은 스태틱 메모리에 있는 interest의 값을 참조한다. 
	// 따라서 어디에서 이자율의 값을 바꾸어도 해당 지점의 이자율이 바뀐 게 아니라 스태틱 메모리에 있는 이자율이 바뀐 것.
	
	// 스테틱 변수는 편리하지만 당장 쓰지 않아도 우선적으로 호출되기 때문에 메모리 용량 차지가 어마무시함. 남용은 지양.
	
	
	private String point;  // 지점
	private String tel;    // 은행 전화번호
	static float interest; // 이자율
	
	// static으로 써주면 은행 한 군데서만 이자율을 바꾸어도 다른 은행지점까지 바뀐다.
	
	public Bank( String point, String tel ) {
		this.point = point;
		this.tel = tel;
		interest = 10;
		
	} // Bank()
	
	
	// 결과 출력 메서드
	public void information() {
		
		System.out.println("지점 : " + point);
		System.out.println("전화번호 : " + tel);
		System.out.println("이자율 : " + interest + "%");
		System.out.println("--------------------");
		
	} // information()
	
	
	
	
	
	

}
