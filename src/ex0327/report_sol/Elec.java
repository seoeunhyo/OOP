package ex0327.report_sol;

public class Elec {
 
	private String code;
	private int cost;
	
	public Elec() {} //기본 생성자는 추가되지 않고 (자동생성 안 됨) 반드시 기본생성자 필요함 
	//기본 생성자 자동 생성되지 않게 만들어주고 하는 것 권장 
	
	public Elec(String code, int cost) {
		super();
		this.code = code;
		this.cost = cost;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Elec [code=");
		builder.append(code);
		builder.append(", cost=");
		builder.append(cost);
		builder.append(" ");
		return builder.toString();
	}


	
	
}
