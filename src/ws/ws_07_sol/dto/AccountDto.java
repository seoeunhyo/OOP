package ws.ws_07_sol.dto;

// WS_04 대비
// AccountType Enum 제거, private, setter & getter
public class AccountDto implements Comparable<AccountDto>{
	private int accountSeq;
	private String accountNumber;
	private int balance;
	private int userSeq;
	
	public AccountDto(){}
	public AccountDto(int accountSeq, String accountNumber, int balance, int userSeq){
		this.accountSeq = accountSeq;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.userSeq = userSeq;
	}	
	
	public int getAccountSeq() {
		return accountSeq;
	}
	public void setAccountSeq(int accountSeq) {
		this.accountSeq = accountSeq;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	
	@Override
	public int compareTo(AccountDto o) {
		// TODO Auto-generated method stub
		return this.balance - o.balance;
	}
	
	@Override
	public String toString() {
		return "AccountDto [accountSeq=" + accountSeq + ", accountNumber=" + accountNumber + 
				", balance=" + balance + ", userSeq=" + userSeq + "]";
	}
}
