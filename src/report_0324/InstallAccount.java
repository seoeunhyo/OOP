package report_0324;

//정기예금계좌 

public class InstallAccount extends AccountDto{
	
	private int period;
	private int amount;
	
	public InstallAccount() {
		super();
	}

	public InstallAccount(int accountSeq, String accountNumber, int balance, int userSeq, int period, int amount) {
		super(accountSeq, accountNumber, balance, userSeq);
		this.period = period;
		this.amount = amount;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", period = "+ this.getPeriod()+", amount = "+ this.getAmount();
	}
	
	
}
