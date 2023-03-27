package ex0327.set;

public class Member {
	
	private String name;
	private int age;
	private String addr;
	
	public Member() {
		
	}

	public Member(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", addr=");
		builder.append(addr);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public int hashCode() {//숫자를 리턴 
		System.out.println("Member의 hashCode() call - age " + age);
		return name.hashCode() + age;
	}
	
	@Override
	public boolean equals(Object obj) {//들어오는 주체와 자기가 가진 것 비교하는 것 520page
		System.out.println("Member의 equals() 호출 - age "+ age);
		
		if(obj instanceof Member) {
			Member m = (Member)obj;
			
			if(name.equals(m.getName()) && age == m.getAge() ) {
				return true; //같다 
			}
			
		}return false;
		
	}
	
}//Member class End 
