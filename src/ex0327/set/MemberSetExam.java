package ex0327.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MemberSetExam {
	private Set<Member>  set = new HashSet<>();//516page

	
	public MemberSetExam() {
		/**
		 * Set의 중복 체크 
		 * 	: 먼저 hashCode() 메소드를 호출해서 다르면 다른 객체로 인식을 하고 
		 * 	만약 hashCode()가 리턴한 값이 같으면 equals() 메소드를 호출해서 true이면 같은 객체
		 * 	false 이면 다른 객체 인식 
		 * 
		 * */
		//3개 저장
		set.add(new Member("서은효", 25, "서울"));
		System.out.println("\n---------------------------------");
		
		set.add(new Member("서은효", 25, "경기"));
		System.out.println("\n---------------------------------");
		set.add(new Member("서은gl", 25, "경기"));
		//set.add(new Member("이순신", 35, "충북"));
		
		System.out.println("저장될 객체의 개수: "+ set.size());
	}
	

	


	public static void main(String[] args) {
		new MemberSetExam();
	}
}
