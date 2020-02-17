package tr.com.jforce.activemq.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;



@Component
public class ApplyLoanRequestRoute extends RouteBuilder {

	public static final String APPLY_LOAN_REQUEST_ROUTE = "direct:APPLYLOANREQUESTROUTE";

	@Autowired
	Environment env;

	@Override
	public void configure() throws Exception {

		from(APPLY_LOAN_REQUEST_ROUTE)
				.to("activemq:" + env.getProperty("applyloan.request.queue") + "?exchangePattern=InOnly").end();
	}

}
