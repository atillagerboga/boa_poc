package tr.com.jforce.riskengine.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import tr.com.jforce.dto.ApplyLoan;
import tr.com.jforce.dto.RiskAnalysisRequest;

@Service
public class RiskAnalysisService {
	
	@Autowired
	private Environment env;
	
	public boolean riskEngine(ApplyLoan applyLoan) {
		
		boolean response=false;
		
		/** 
		 * create risk engine request and call risk engine web services
		 * return true or false
		 */
		try {
//			RiskAnalysisRequest riskAnalysisRequest=new RiskAnalysisRequest();
//			riskAnalysisRequest.setAmount(applyLoan.getAmount());
//			riskAnalysisRequest.setNationalID(applyLoan.getNationalID());
//			String riskanalysisURL =env.getProperty("riskanalysis.riskengine.url");
//			RestTemplate restTemplate = new RestTemplate();
//			response = restTemplate.postForObject(riskanalysisURL, riskAnalysisRequest, boolean.class);
//			return response;
		} catch (RestClientException e) {
			e.printStackTrace();
		}
		return response;
	}
}
