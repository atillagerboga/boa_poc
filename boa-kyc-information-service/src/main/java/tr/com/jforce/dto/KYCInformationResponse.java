package tr.com.jforce.dto;

import java.io.Serializable;
import java.util.Date;

public class KYCInformationResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3878812756669978994L;
	
	private String lastEmployerName; 
	private Date startDate;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getLastEmployerName() {
		return lastEmployerName;
	}
	public void setLastEmployerName(String lastEmployerName) {
		this.lastEmployerName = lastEmployerName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	} 
}