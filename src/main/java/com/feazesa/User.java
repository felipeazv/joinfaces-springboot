package com.feazesa;

import javax.annotation.ManagedBean;
import lombok.Data;

@Data
@ManagedBean
public class User {
  private String text;    
  private String firstName = "Felipe";
  private String lastName = "Azevedo";

  public String helloUser() {
    return "Hello " + firstName + " " + lastName + "!";
  }
}