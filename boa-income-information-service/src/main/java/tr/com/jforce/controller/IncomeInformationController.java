package tr.com.jforce.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import tr.com.jforce.dto.IncomeInformationResponse;
import tr.com.jforce.external.client.IncomeInformationWS;

@RestController
@Api(value = "IncomeInformation Controller", description = "IncomeInformation Controller API services")
public class IncomeInformationController {
	
	
	@Autowired
	IncomeInformationWS incomeInformationWS;
	
	@RequestMapping(path="/getIncomeInformation/{nationalID}", method = RequestMethod.GET)
	@Cacheable(value= "incomeInformationCache", key= "#nationalID")	
	public List<IncomeInformationResponse> getIncomeInformation ( @PathVariable("nationalID") String   nationalID ) {
		
		return incomeInformationWS.getIncomeInformationResponse(nationalID);
	
	}

}
