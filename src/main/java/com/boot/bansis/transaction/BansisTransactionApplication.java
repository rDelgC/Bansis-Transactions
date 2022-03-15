package com.boot.bansis.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing;

@SpringBootApplication
@EnableReactiveMongoAuditing
public class BansisTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(BansisTransactionApplication.class, args);
	}

}
