package ex0327.set;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
	//Set<Integer> set = new HashSet<>();
	Set<Integer> set = new TreeSet<>(); //요소를 정렬 
	
	public SetExam(String [] args ) { //실행 : java SetExam 값 값 값 ....
		//set 숫자를 추가
		for(String a : args) {
			boolean result = set.add(Integer.parseInt(a));
			System.out.println(a + "추가 결과: "+ result);
		}
		System.out.println("저장된 개수: "+ set.size());
		
		//Iterator interface는 모든 자료구조안에 저장된 데이터를 추출(꺼내기)할 때 사용하는 표준화된 interface
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {//요소가 존재한다면
			int no = it.next(); //요소를 꺼낸다.
			System.out.println(no);
		}
		
		System.out.println("---개선된 for---");
		for( int no : set ) {
			System.out.println(no);
		}
		
		//제거해보자
		boolean re = set.remove(30);
		System.out.println("제거 후 : " + set);
		System.out.println("저거 결과: " + re);
		
		
	}
	
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SetExam other = (SetExam) obj;
		return Objects.equals(set, other.set);
	}


	public static void main(String[] args) {
		
		
		new SetExam(args);
		
	}
//로또번호 6개를 랜덤으로 발생시켜 정렬해보기 , list, set, map -> set (중복이 안 되기 때문에)
}
