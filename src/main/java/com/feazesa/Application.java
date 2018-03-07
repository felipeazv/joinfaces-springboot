package com.feazesa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
  
    @GetMapping(path = "/" , produces = MediaType.TEXT_PLAIN_VALUE)
    public String index() {
        return "Spring Boot on AWS!";
    }
	
}

