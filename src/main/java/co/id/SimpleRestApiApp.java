package co.id;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages={ "co.id" })
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SimpleRestApiApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRestApiApp.class, args);
	}

}
