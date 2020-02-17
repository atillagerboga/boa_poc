package tr.com.jforce.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class Deduction implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1012614078200257851L;
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