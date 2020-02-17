package tr.com.jforce.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class RiskAnalysisRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2319515661907247084L;
	private String nationalID;
	private BigDecimal amount;
	
	public String getNationalID() {
		return nationalID;
	}
	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
