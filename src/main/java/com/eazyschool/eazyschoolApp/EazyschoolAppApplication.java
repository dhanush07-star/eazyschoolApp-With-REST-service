package com.eazyschool.eazyschoolApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.eazyschool.eazyschoolApp.repository")
@EntityScan("com.eazyschool.eazyschoolApp.model")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class EazyschoolAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazyschoolAppApplication.class, args);
	}

}
