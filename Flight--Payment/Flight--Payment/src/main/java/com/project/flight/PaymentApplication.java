package com.project.flight;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@EnableEurekaClient
@OpenAPIDefinition(info=@Info(title="Payment  API",version="1.0",description="An API used for Payment"))
public class PaymentApplication {
@Bean
	public RestTemplate getRestTemplate() {
	return new RestTemplate();
}

	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
	}

}
