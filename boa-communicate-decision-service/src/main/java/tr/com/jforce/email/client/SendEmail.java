package tr.com.jforce.email.client;

import org.springframework.stereotype.Service;

import tr.com.jforce.dto.Notification;

@Service
public class SendEmail {

	public boolean sendEmailNotification(Notification notification) {

		//call email web service
		return true;
		
	}
}
