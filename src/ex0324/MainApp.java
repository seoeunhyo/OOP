package ex0324;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		//객체 생성
		Person p; // = new Person("은효", 25); -> abstract 클래스는 생성 불가, 타입 선언만 가능 
		
		
		
		//print(Object obj) or println(Object obj) --> obj.toString() 호출된다!!
		//System.out.println("p = "+p);
		//System.out.println("p.toString() = "+p.toString()); //getClass().getName() + '@' + Integer.toHexString(hashCode())
		//System.out.println("---------------Person 객체---------------------");
		//p.eat();
		//p.walk();
		
		/*
		SpiderMan sm = (SpiderMan) p; //downcasting, 실행 도중 에러 발생. Person은 spider를 가지고 있진 않다. 
		//ClassCastException 발생 
		sm.eat();
		sm.jump();
		*/
		
		System.out.println("----------------SpiderMan---------------------");
		p = new SpiderMan("자식1", 20, true); //Ok -> 다형성 성립
		System.out.println("p = "+p);
 		p.eat(); //부모쪽에만 있다 
 		p.walk(); // 부모+ 자식에도 다 있다 - 재정의했다. -> 재정의된 메소드는 부모타입일지라도 자식부분 호출됨 
 		
 		//p변수로 자식부분의 메소드나 필드를 접근하고 싶으면 ObjectDownCasting이 필요하다 
 		SpiderMan sm = (SpiderMan) p;//부모 > 자식이라 접근 불가, 그러나 spiderman객체가 생성되었음 
 		System.out.println("p = "+p);
 		System.out.println("sm = "+sm);
 		
 		sm.jump();
 		sm.eat();
 		System.out.println("-----------------------------------------------");
 		
 		sm.walk();//Person과 SpiderMan 둘 다 walk가 호출됨 
 		


	}

}
