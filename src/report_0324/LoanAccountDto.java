package report_0324;

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
		return super.toString()+ ", mortagage = "+ this.getMortagage();
	}
	

}
