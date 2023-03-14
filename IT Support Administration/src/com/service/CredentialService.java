package com.service;
import com.employee.*;
import java.util.*;
public class CredentialService {
  
  
  String companyName = "GreatLearning";
  
  Random random = new Random();
  
  public String generateEmailAddress(Employee emp, String department) {
	  String email = emp.getfirstName() + emp.getlastName() + "@" + department + "." + companyName + ".com";
	  return email;
  }
  
  public String generatePassword() {
	  
	  String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	  String small = "abcdefghijklmnopqrstuvwxyz";
	  String number = "0123456789";
	  String special = "~`!@#$%^&*()_+=|:<>?/";
	  
	  String password = "";
	  password += capital.charAt(random.nextInt(capital.length()));
	  password += capital.charAt(random.nextInt(capital.length()));
	  password += small.charAt(random.nextInt(small.length()));
	  password += small.charAt(random.nextInt(small.length()));
	  password += number.charAt(random.nextInt(number.length()));
	  password += number.charAt(random.nextInt(number.length()));
	  password += special.charAt(random.nextInt(special.length()));
	  password += special.charAt(random.nextInt(special.length()));
	  return password;
  }
  
  public void showCredentials(Employee emp) {
	  System.out.println("Dear " + emp.getfirstName() + " your genereated credentials are: ");
	  System.out.println("Email -> " +  emp.getEmail());
	  System.out.println("Password -> " + emp.getPassword());
  }
}
