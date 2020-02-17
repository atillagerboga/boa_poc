package tr.com.jforce.activemq.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import tr.com.jforce.dto.ApplyLoan;
import tr.com.jforce.riskengine.client.RiskAnalysisService;


@Component
public class RiskAnalysisRoute extends RouteBuilder{

	@Autowired
	Environment env;
	
	@Autowired
	private RiskAnalysisService riskAnalysisService;
	
	@Override
	public void configure() throws Exception {
		
		from("activemq:" + env.getProperty("riskanalysis.request.queue"))
		.process(new Processor() {
			@Override
			public void process(Exchange exchange) throws Exception {
				
				Gson gson=new Gson();
				ApplyLoan applyLoan=gson.fromJson( exchange.getIn().getBody().toString(), ApplyLoan.class);
			    boolean response=riskAnalysisService.riskEngine(applyLoan);
			    if(response) {
			    	//business decision
			    }else {
			    	//business decision
			    }
			}
		}).end();
	}
}
