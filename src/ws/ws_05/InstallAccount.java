package ws.ws_05;

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
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(", peroid = "+ this.getPeriod());
		sb.append(", amount = " + this.getAmount());
		
		
		return sb.toString();
		
	}
	
	
}
