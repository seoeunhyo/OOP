package ex0327.set;


public class HashCodeTest {
	public static void main(String[] args) {
		//문자가 다름에도 불구하고 hashcode가 같은 상황이 발생할 수 있음
		String s="Z@S.ME";
		String s2="Z@RN.E";
		
		//String s="java1";
		//String s2= new String("java");
		
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());

		if(s.equals(s2)	)
			System.out.println("same");
		else
			System.out.println("different");
	}

}
