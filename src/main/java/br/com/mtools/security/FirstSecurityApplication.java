package br.com.mtools.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.mtools")
public class FirstSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSecurityApplication.class, args);
	}

}