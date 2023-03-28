package ex0328.Exception문제_shop;

import java.util.Random;

//import ex0328.Exception문제.Exception문제.shopException;



class shopException extends Exception {
	
	static int cnt;
	
	public shopException () {}
		
	public shopException (String message) {
		super(message);
		cnt++;
		//System.out.println(message);
		
	}
	
	
}


class ShoppingMall {
	
	//private int age;
	
	
	public void enter (int age) throws shopException {
		//this.age = age;
		
		if(age < 18) {
			throw new shopException(age + "애들은 가라.");
			
		}else {
			System.out.println(age + "입장하신걸 환영합니다.");
		}
	}
}

public class Exception문제 {

	public static void main(String[] args) {
		Random random = new Random();
		
		ShoppingMall sp= new ShoppingMall();
		
		
		for(int i =0; i< 10; i++) {
			int age = random.nextInt(55) +1;
			try {
				sp.enter(age);
			} catch (shopException e) {
				System.out.println(e.getMessage());
				
			}
			
		}
		shopException e = new shopException();
		System.out.println(e.cnt);
		
	}


	}


