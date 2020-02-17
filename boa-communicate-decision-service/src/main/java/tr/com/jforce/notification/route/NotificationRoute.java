package tr.com.jforce.notification.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import tr.com.jforce.dto.Notification;
import tr.com.jforce.email.client.SendEmail;

@Component
public class NotificationRoute extends RouteBuilder{

	@Autowired
	Environment env;
	
	@Autowired
	private SendEmail sendEmail;
	
	@Override
	public void configure() throws Exception {
		
		from("activemq:" + env.getProperty("notification.request.queue"))
		.process(new Processor() {
			
			@Override
			public void process(Exchange exchange) throws Exception {
				//{"firstName":"JFORCE","lastName":"JFORCE","emailAdress":"test@gmail.com","phone":"0555 555 55 55","message":"test message"}
				String body= exchange.getIn().getBody().toString();
				Gson gson=new Gson();
				Notification notification=gson.fromJson(body, Notification.class);
				sendEmail.sendEmailNotification(notification);
			}
		})
		.end();
		
	}
}
