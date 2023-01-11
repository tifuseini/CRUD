package com.example.jpaExample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
@Slf4j
public class JpaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaExampleApplication.class, args);
	}

	/** Command line Runner Impln ementation **/
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			log.info("Hello World");
		};

	}


}
