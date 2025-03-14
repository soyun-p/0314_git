package ex9_pen;

public class Pen {
	
	// 생성자 : 객체가 생성될 때 메모리 할당.
	
	// 멤버 변수의 초기화 목적으로도 사용. (아래의 작업)
	
	private String company; // = "monami";
	private String color; // = "black";
	private int price;  // = 1000; 
	// -> 보통은 멤버 변수를 선언만 해놓고 아래와 같이 Pen() 생성자를 이용해 멤버 변수를 초기화해놓는다.
	
	// 생성자는 반드시 메서드 이름으로 한다.(임의대로 정하는 것은 불가능.)
	public Pen() {
		company = "monami";
		color = "black";
		price = 1000;
	} // Pen() 생성자
	
	
	// 생성자도 오버로딩 가능
	public Pen( String color, int price ) { // 생성자 이름은 같아서는 안 되지만, 인자 혹은 인자 수, 인자 타입이 다를 경우는 가능.(-> 오버로드)
		company = "monami";
		this.color = color;
		this.price = price;
		
	}
	
	
	public String getCompany() {
		return company;
	}
	public String getColor() {
		return color;
	}
	public int getPrice() {
		return price;
	}
	
	

	
	
}
