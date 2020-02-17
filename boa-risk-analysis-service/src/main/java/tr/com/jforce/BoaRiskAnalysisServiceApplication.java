package tr.com.jforce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "tr.com.jforce.*" })
public class BoaRiskAnalysisServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoaRiskAnalysisServiceApplication.class, args);
	}

}
