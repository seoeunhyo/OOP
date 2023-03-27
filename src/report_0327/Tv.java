package report_0327;

public class Tv extends Elec implements ElecFunction {
	private int chnnel;
	
	
	public Tv() {}


	public Tv(int chnnel) {
		super();
		this.chnnel = chnnel;
	}


	public Tv(String code, int cost, int chnnel) {
		super(code, cost);
		this.chnnel = chnnel;
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tv [chnnel=");
		builder.append(chnnel);
		return builder.toString();
	}


	@Override
	public void start() {
		System.out.println(this.getCode() + "제품 Tv를 " + chnnel+"을 본다");
		
	}


	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	
	
}
