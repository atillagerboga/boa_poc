package tr.com.jforce.external.client;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import tr.com.jforce.dto.Address;
import tr.com.jforce.dto.KYCInformationResponse;


@Service
public class KycInformationWS {
	
	@Autowired
	private Environment env;
	
	public KYCInformationResponse getKycInformation(String nationalID) {
		try {
			
			/**
			 * HERE INVOKE EXTRNAL REST SERVICE WITH BASIC AUTH
			 */
			
//			String coresystemURL =env.getProperty("coresystem.URL") +"nationalID";
//			String coresystemToken =env.getProperty("coresystem.Token");
//			RestTemplate restTemplate = new RestTemplate();
//			HttpHeaders headers = new HttpHeaders();
//			headers.set("Authorization",coresystemToken);
//			HttpEntity<String> entity = new HttpEntity<String>(headers);
//			ResponseEntity<String> response = restTemplate.exchange(coresystemURL, HttpMethod.GET, entity,String.class);
//			Gson gson = new Gson();
//			KYCInformationResponse kycInformationResponse= gson.fromJson(response.getBody(), KYCInformationResponse.class);
//			return kycInformationResponse;
		} catch (RestClientException | JsonSyntaxException e) {
			e.printStackTrace();
		}
		return mockGetKycInformation();
	}
	
	
	public KYCInformationResponse mockGetKycInformation() {
		KYCInformationResponse kycInformationResponse=new KYCInformationResponse();
		kycInformationResponse.setLastEmployerName("Jforce Bilişim Teknolojileri AŞ");
		kycInformationResponse.setStartDate(new Date());
			Address address=new Address();
			address.setCity("ISTANBUL");
			address.setCountry("TURKEY");
			address.setPostalCode("34000");
		kycInformationResponse.setAddress(address);
		return kycInformationResponse;
	}
}