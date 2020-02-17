package tr.com.jforce.external.client;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import tr.com.jforce.dto.Deduction;
import tr.com.jforce.dto.Income;
import tr.com.jforce.dto.IncomeInformationResponse;
import tr.com.jforce.util.Utility;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

@Service
public class IncomeInformationWS {
	
	@Autowired
	private Environment env;
	
	public List<IncomeInformationResponse> getIncomeInformationResponse(String nationalID) {
		List<IncomeInformationResponse> incomeInformationResponse=new ArrayList<>();
		
		System.out.println("------- INVOKE EXTRNAL REST SERVICE-----------");
		try {
			
			/**
			 * HERE INVOKE EXTRNAL REST SERVICE 
			 */
			
//			String incomeinformationURL =env.getProperty("incomeinformation.URL") +"nationalID";
//			RestTemplate restTemplate = new RestTemplate();
//			ResponseEntity<String> response = restTemplate.getForEntity(incomeinformationURL ,String.class);
//			Gson gson = new Gson();
//			Type listType = new TypeToken<ArrayList<IncomeInformationResponse>>(){}.getType();
//			incomeInformationResponse= gson.fromJson(response.getBody(), listType);
//			return incomeInformationResponse;
		} catch (RestClientException | JsonSyntaxException e) {
			e.printStackTrace();
		}
		return mockGetIncomeInformationResponse(nationalID);
	}
	
	public List<IncomeInformationResponse> mockGetIncomeInformationResponse(String nationalID) {
		//for testing nationalID 1,2,3
		List<IncomeInformationResponse> incomeInformationResponseList=new ArrayList<>();
		switch (Integer.valueOf(nationalID)) {
		case 1:
			incomeInformationResponseList=testData(1);
			break;
		case 2:
			incomeInformationResponseList=testData(2);
			break;
		default:
			incomeInformationResponseList=testData(3);
		}
		return incomeInformationResponseList;
	}
	
	public List<IncomeInformationResponse> testData(int id) {
		List<IncomeInformationResponse> incomeInformationResponseList = new ArrayList<>();
		IncomeInformationResponse incomeInformationResponse = new IncomeInformationResponse();
		Income income = new Income();
		income.setMonth(Utility.theMonth(id));
		income.setAmount(new BigDecimal("100000").multiply(new BigDecimal(id)));
		Deduction deduction = new Deduction();
		deduction.setMonth(Utility.theMonth(id));
		deduction.setAmount(new BigDecimal("2000").multiply(new BigDecimal(id)));
		incomeInformationResponse.setIncome(income);
		incomeInformationResponse.setDeduction(deduction);
		incomeInformationResponseList.add(incomeInformationResponse);
		return incomeInformationResponseList;
	}
}