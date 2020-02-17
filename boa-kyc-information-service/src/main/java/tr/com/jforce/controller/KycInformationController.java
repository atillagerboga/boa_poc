package tr.com.jforce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import tr.com.jforce.dto.KYCInformationResponse;
import tr.com.jforce.external.client.KycInformationWS;

@RestController
@Api(value = "KycInformation Controller", description = "KycInformation Controller API services")
public class KycInformationController {
	
	@Autowired
	private KycInformationWS  kycInfoWS;
	
	@Autowired
	private Environment env;
	
	@RequestMapping(path="/getKYCInformation/{nationalID}", method = RequestMethod.GET)
	public KYCInformationResponse getKYCInformation ( @PathVariable("nationalID") String   nationalID ) {
		
		System.out.println("---------------------");
		String coresystemURL =env.getProperty("coresystem.URL") +"nationalID";
		System.out.println(coresystemURL);
		
		return kycInfoWS.getKycInformation(nationalID);
	
	}
}