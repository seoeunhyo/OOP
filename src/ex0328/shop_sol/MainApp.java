package ex0328.shop_sol;

import java.util.Random;

public class MainApp {

	public static void main(String[] args) throws AgeCheckException {
		System.out.println("-------ShoppingMall OPEN----------\n");
		
		ShoppingMall mall = new ShoppingMall();
		Random r = new  Random();
		
		
		for(int  i = 0; i<10; i++) {
			int age = r.nextInt(55)+1;
			
			try {
				mall.enter(age);
			}catch(AgeCheckException e){
				System.out.println(e.getMessage());
			}
			System.out.println();
			}
		System.out.println("예외 개수 : " + AgeCheckException.cnt+"\n");
		
		System.out.println("-------ShoppingMall CLOSE----------");
		
	}

}
