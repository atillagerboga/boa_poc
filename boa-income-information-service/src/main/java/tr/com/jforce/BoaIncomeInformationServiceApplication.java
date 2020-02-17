package tr.com.jforce;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = { "tr.com.jforce.*" })
@EnableSwagger2
@EnableCaching
public class BoaIncomeInformationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoaIncomeInformationServiceApplication.class, args);
		
	}

}
