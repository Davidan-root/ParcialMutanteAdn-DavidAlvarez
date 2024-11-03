package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.demo", "com/demo/Controllers", "com/demo/Services", "com/demo/dto", "com/demo/Entities", "com/demo/Repositories","com/demo/Validators"})
public class ParcialMutanteDetectorApplication {

	public static void main(String[] args) {
		SpringApplication.run( ParcialMutanteDetectorApplication.class, args);

		System.out.println("Aplcacion en Funcionamiento");
	}

}
