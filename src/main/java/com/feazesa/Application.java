package com.feazesa;

import javax.annotation.ManagedBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Data;

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

@Data
@ManagedBean
class HelloWorld {

  private String firstName = "Felipe";
  private String lastName = "Azevedo";

  public String showGreeting() {
    return "Hello " + firstName + " " + lastName + "!";
  }
}