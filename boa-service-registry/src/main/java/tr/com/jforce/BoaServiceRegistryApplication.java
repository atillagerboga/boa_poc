package tr.com.jforce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BoaServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoaServiceRegistryApplication.class, args);
	}

}
