package tr.com.jforce.dto;

import java.io.Serializable;


public class Notification implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -582995128401110891L;
	private String firstName;
	private String lastName;
	private String emailAdress;
	private String phone;
	private String message;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailAdress() {
		return emailAdress;
	}
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
