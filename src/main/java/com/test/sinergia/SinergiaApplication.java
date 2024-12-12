package com.test.sinergia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.test.sinergia")
@SpringBootApplication
public class SinergiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SinergiaApplication.class, args);
	}

}
