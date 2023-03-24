package ex0324;

public class SpiderMan extends Person { //SpiderMan is a person 성립
	
	private boolean spider;
	
	public SpiderMan() {
		super(); 
	}
	
	public SpiderMan(String name, int age, boolean spider) {
		//this.name = name; //Person쪽에 private String name으로 정의되어 있음 
		//부모의 메소드만을 통해서 호출해야 하거나 
//		this.setName(name);
//		super.setAge(age);
		//super();
		super(name,age); // 위의 SpderMan()은 무시가 되어버림
		this.spider = spider;
		
	}
	public boolean isSpider() { //boolean 형의 조회는 isXxx로 된다! 
		return spider;
	}

	
	//부모의 메소드 재정의
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString() + " | " + spider;
		}
	
	
	//자식만이 갖는 메소드
	public void jump() {
		System.out.println("SpiderMan만 가지고 있는 jump() call...");
	}
	
	@Override
		public void walk() {
			//부모쪽에 있는 walk() 호출하고 싶다.
			super.walk();
			
			System.out.println("SpiderMan의 walk() call - 걷는거 싫다.");
		}

	@Override
	public void sleep() {
		System.out.println("SpiderMan sleep call........");
	}
	
//	private boolean isSpdider(boolean spider) {
//	this.spider=  spider;
//	}
}
