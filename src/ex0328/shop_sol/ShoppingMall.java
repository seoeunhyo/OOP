package ex0328.shop_sol;


/**
 * 나이를 인수로 받는 메소드 작성 
 * */

public class ShoppingMall {
	
	public void enter(int age) throws AgeCheckException {
		if(age > 18) {
			//AgeCheckException ex = new AgeCheckException("애들은 가라");
			//throw ex;
			
			
//			try {
//				
//				throw~ 
//			}catch(AgeCheckException e) {
//				
//			}
			
			//위 처럼 하지말고 예외를 던져버리자
			throw new AgeCheckException("애들은 가라");
			
		}
		System.out.println(age + "살 님 입장하신 걸 환영합니다.");
	}
}
