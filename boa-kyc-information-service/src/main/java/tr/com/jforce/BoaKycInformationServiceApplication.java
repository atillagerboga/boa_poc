package tr.com.jforce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = { "tr.com.jforce.*" })
@EnableSwagger2
public class BoaKycInformationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoaKycInformationServiceApplication.class, args);
	}

}