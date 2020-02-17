package tr.com.jforce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BoaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoaConfigServerApplication.class, args);
	}

}
