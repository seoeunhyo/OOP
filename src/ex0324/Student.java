package ex0324;

public class Student extends Person{ //Student is a Person 

	private int sno;
	
	public Student() {
	}
	public Student(String name, int age, int sno) {
		super(name, age);
		this.sno = sno;
	}
	
	public Student(String name ) {
		super(name);
	}
	
	public Student(String name,  int sno ) {
		super(name);
		this.sno = sno;
	}
	
	@Override
		public String toString() {
			return super.toString() + " | " + sno;
		}
	
	
	@Override
	public void sleep() {
		System.out.println("Student의 sleep call....");
		
	} 
	
}
