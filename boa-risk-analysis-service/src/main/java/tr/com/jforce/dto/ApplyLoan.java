package tr.com.jforce.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class ApplyLoan implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3858412791547395796L;
	private String nationalID;
	private int month;
	private BigDecimal amount;
	
	public String getNationalID() {
		return nationalID;
	}
	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
