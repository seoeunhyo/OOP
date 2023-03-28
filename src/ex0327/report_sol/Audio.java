package ex0327.report_sol;

public class Audio extends ex0327.report_sol.Elec implements ex0327.report_sol.ElecFunction {

	private int volumn;
	
	public Audio() {}
	public Audio(int volumn) {this.volumn = volumn;}
	
	public Audio(String code, int cost, int volumn) {
		super(code, cost);
		this.volumn = volumn;
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(getCode() + "제품 "+getClass().getSimpleName()+ "를"+volumn+"으로 듣는다.");
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
