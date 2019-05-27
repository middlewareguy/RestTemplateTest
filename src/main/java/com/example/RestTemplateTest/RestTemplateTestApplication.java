package com.example.RestTemplateTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ({"org.apache.http", "com.example" } )
public class RestTemplateTestApplication {


	public static void main(String[] args) {
		SpringApplication.run(RestTemplateTestApplication.class, args);
	}

}
