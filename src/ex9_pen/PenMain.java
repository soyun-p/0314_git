package ex9_pen;

public class PenMain {
	public static void main(String[] args) {
		
		Pen p1 = new Pen();
		Pen p2 = new Pen();
		
		System.out.println(p1.getCompany());
		System.out.println(p1.getColor());
		System.out.println(p1.getPrice());
		
		System.out.println("----------------------");
		
		System.out.println(p2.getCompany());
		System.out.println(p2.getColor());
		System.out.println(p2.getPrice());
		
		Pen p3 = new Pen( "gold", 20000 );
		System.out.println(p3.getColor());
		System.out.println(p3.getPrice());
		
		// p3.Pen(); -> 보안적으로 더 안전. 이미 Pen()으로 호출했기 때문에 임의로 p3.으로 다시 호출할 수는 없다.
		p3 = new Pen( "gold", 30000 );  // 위에 있던 기존 생성자의 값을 바꾼 것이 아니라 새로운 메모리를 할당 받아 새롭게 호출된 것.
		
		
		
	} // main

}
