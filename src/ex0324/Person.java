package ex0324;


/**
 *
 *abstract 클래스는 생성불가, 상속만 가능
 */
public abstract class Person implements Comparable<Person>{ //extends Object가 선언되어있다.
	//은닉(외부에서 사용자가 마음대로 조회, 변경 막는다)set/get 필요!!!!
	private String name;
	private int age;
	
	public Person() {} //기본 생성자, 밑에처럼 생성자 하나 생기면 실행 안 된다
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age ) {
		//필드 초기화 
		//this.name = name; //name = name은 지역변수가 우선이기 때문에 자기 자신을 칭하는 게 된다 
		this(name); //String 인수 하나 받는 생성자 호출(반드시 생성자 구현부 첫줄)
		this.age = age; 
		
	}

	/*set() - 변경, 수정 
	*
	* :제한자 - public
	* 리턴타입 - void 
	* 메소드 이름 - set + 필드 이름의 첫 글자 대문자( ) 
	* 인수 - 필수 
	*/
	
	
	/*get() - 조회 
	*
	* :제한자 - public
	* 리턴타입 - 필수 
	* 메소드 이름 - get + 필드 이름의 첫 글자 대문자( ) 
	* 인수 - 없음 
	* 
	*/
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 
	
	/*
	 * 부모의 정의되어 있는 메소드를 자식 클래스에서 새롭게 재정의하는 것을 overriding이라고 한다.
	 *  : 규칙 - 제한자만 다를 수 있고, 접근 제한자는 부모 제한자보다 같거나 커야한다. 
	 *  		(public > protected > 생략 > private)
	 *  		리턴타입, 메소드 이름, 인수 모두 같다.
	 *  		단, 기능은 다르게 작성한다. 
	 */
	
	@Override
		public String toString() {
			return  name + " | " + age;
		}
	
	public void eat() {
		System.out.println("Person의 eat() call...");
	}
	
	public void walk() {
		System.out.println("Person의 walk() call...");
	}
	
	// 추상 메소드 선언 - 선언문만 있고 body = 기능은 없다, abstract 메소드를 가지고 있는 class는 반드시 
	// abstract 선언되어야 한다. 
	public abstract void sleep();
	
	@Override
		public int compareTo(Person o) {
		
		return age - o.getAge(); //자신의 나이와 인수로 전달된 나이를 비교 
	
	}
}

