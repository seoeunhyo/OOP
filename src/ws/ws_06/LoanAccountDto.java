package ws.ws_06;

public class LoanAccountDto extends AccountDto {

	private String mortagage;
	
	//public LoanAccountDto() {super()};
	
	public LoanAccountDto() {
		super();
	}
	
	
	public LoanAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, String mortgage) {
		super(accountSeq, accountNumber, balance, userSeq);
		this.mortagage = mortgage;
	}

	public String getMortagage() {
		return mortagage;
	}

	public void setMortagage(String mortagage) {
		this.mortagage = mortagage;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(", mortagage = "+ this.getMortagage());
		
		return sb.toString();
	}
	

}
