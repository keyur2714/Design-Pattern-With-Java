package com.webstack.dp.dto;

public class Contact {
	private String mobileNo;
	private String email;

	public Contact(String mobileNo,String email) {
		this.mobileNo = mobileNo;
		this.email = email;
	}	
	
	public Contact() {}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Contact [mobileNo=" + mobileNo + ", email=" + email + "]";
	}

}
