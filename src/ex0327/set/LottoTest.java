package ex0327.set;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoTest extends TreeSet<Integer>{
	
	static Random random = new Random();
	
	
	
	public LottoTest() {
		
		//1~45 사이의 난수를 발생해서 Set에 숫자 6개를 저장한다 
		while(super.size() < 6) {
			super.add(random.nextInt(45)+1);
			}
		
		System.out.println("저장된 번호 : " + this); // super는 부모를 지칭하는 키워드지 자체가 정보는 없다
		Iterator<Integer> it = this.descendingIterator();
	
		while(it.hasNext()) {
			System.out.print(it.next()+ ", ");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new LottoTest();
	}

}
