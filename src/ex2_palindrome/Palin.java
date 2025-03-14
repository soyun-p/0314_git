package ex2_palindrome;

public class Palin {
	
	public void palin( String str ) {
		
		String rev = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			
			rev += str.charAt(i);
			
		} // for outer
		
		if( str.equals(rev) ) {
			System.out.println("회문입니다.");
		}else {
			System.out.println("회문이 아닙니다.");
		}
		
		
		
		
	} // palin()

}
