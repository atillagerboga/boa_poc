package tr.com.jforce.dto;

import java.io.Serializable;

public class IncomeInformationResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6850974602138839342L;
	private Income income;
	private Deduction deduction;
	
	public Income getIncome() {
		return income;
	}
	public void setIncome(Income income) {
		this.income = income;
	}
	public Deduction getDeduction() {
		return deduction;
	}
	public void setDeduction(Deduction deduction) {
		this.deduction = deduction;
	}

}
