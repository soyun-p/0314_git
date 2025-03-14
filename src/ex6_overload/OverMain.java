package ex6_overload;

public class OverMain {
	public static void main(String[] args) {
		
		Over ov = new Over();
		ov.result();
		ov.result(10);
		ov.result('a');
		ov.result(10, "hi");  // 인자는 순서에 맞게 써줘야 한다.
		ov.result("hi", 10);
		System.out.println();
		
		// 메서드()의 괄호 안에서 컨트롤+스페이스 바 누르면 같은 메서드 내에서 쓸 수 있는 여러 기능들이 나오는데 이것도 오버로드.
		
	} // main

}
