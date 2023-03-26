package report_0324;

public class SavingAccountDto extends AccountDto{

	private int transferFee;


	public SavingAccountDto() {
		super();
	}
	
	public SavingAccountDto(int accountSeq, String accountNumber, int balance, int userSeq,int transferFee) {
		super(accountSeq, accountNumber, balance, userSeq);
		this.transferFee = transferFee;
	} 


	


	public int getTransferFee() {
		return transferFee;
	}

	public void setTransferFee(int transferFee) {
		this.transferFee = transferFee;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", transferfee = "+ this.getTransferFee();
	}
}
