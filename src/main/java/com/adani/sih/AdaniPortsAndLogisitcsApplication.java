package com.adani.sih;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.adani.sih.entities.LoginDtls;

@SpringBootApplication
@EntityScan("com.adani.sih.entities")
@EnableJpaRepositories("com.adani.sih.repository")

public class AdaniPortsAndLogisitcsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(AdaniPortsAndLogisitcsApplication.class, args);
	}

}
