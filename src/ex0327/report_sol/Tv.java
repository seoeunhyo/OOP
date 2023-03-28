package ex0327.report_sol;

public class Tv extends Elec implements ex0327.report_sol.ElecFunction {

	private int chnnel;
	
	public Tv() {}
	
	
	public Tv(int chnnel) {
		this.chnnel = chnnel;
	}
	public Tv(String code, int cost,  int chnnel) {
		super(code, cost);
		this.chnnel = chnnel;
		// TODO Auto-generated constructor stub
	}
	


	@Override
	public void start() {
		System.out.println(getCode() + "제품 "+getClass().getSimpleName()+ "를 "+chnnel+"본다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("chnnel=");
		builder.append(chnnel);
		builder.append(" ");
		return builder.toString();
	}

}
