package tr.com.jforce.controller;

import javax.validation.Valid;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import io.swagger.annotations.Api;
import tr.com.jforce.activemq.route.ApplyLoanRequestRoute;
import tr.com.jforce.dto.ApplyLoan;

@RestController
@Api(value = "Apply Loan Controller", description = "Apply Loan Controller API services")
public class ApplyLoanController {
	
	@Autowired
	private ProducerTemplate producerTemplate;
	
	
	@RequestMapping(path="/applyLoan", method = RequestMethod.POST)
	public ResponseEntity<?> postApplyLoan(@Valid @RequestBody ApplyLoan applyLoan) {
		Gson gson=new Gson();
		String applyLoanRequest=gson.toJson(applyLoan);
		producerTemplate.asyncRequestBody(ApplyLoanRequestRoute.APPLY_LOAN_REQUEST_ROUTE, applyLoanRequest);
		return new ResponseEntity<>("SUCCESS", HttpStatus.ACCEPTED);
		
	}
}