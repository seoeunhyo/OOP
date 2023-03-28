package ex0328.shop_sol;


/**
 * 나이가 18보다 작으면 발생할 예외 클래스 
 * */

public class AgeCheckException extends Exception{//is a 
	static int cnt;
	
	public AgeCheckException() {
		cnt++;
	}
	
	public AgeCheckException(String message) {
		super(message);
		cnt++;
	}
	
	
}
