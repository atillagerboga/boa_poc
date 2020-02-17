package tr.com.jforce.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class Income implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8548703183460768925L;
	private String month;
	private BigDecimal amount;
	
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}