package ws.ws_06;

/**
 * 고객의 정보를 관리할 객체 
 **/
public class UserDto {
	private int userSeq;
	private String name;
	private String email;
	private String phone;
	private boolean isSleep; //기본값 false
	

	public UserDto(int userSeq, String name, String email, String phone, boolean isSleep) {
		
		this.userSeq = userSeq;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.isSleep = isSleep;
	}


	public int getUserSeq() {
		return userSeq;
	}


	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public boolean isSleep() {
		return isSleep;
	}


	public void setSleep(boolean isSleep) {
		this.isSleep = isSleep;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserDto [userSeq=");
		builder.append(userSeq);
		builder.append(", name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", isSleep=");
		builder.append(isSleep);
		builder.append("]");

		return builder.toString();
	}
	
	
}