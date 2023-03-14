package com.employee;

public class Employee {
   private String firstName;
   private String lastName;
   private String email;
   private String password;
   
   public Employee(String firstName, String lastName) {
	   this.firstName = firstName;
	   this.lastName = lastName;
   }
   
   public String getfirstName() {
	   return firstName;
   }
   
   public void setFirstName(String firstName) {
	   this.firstName = firstName;
   }
   
   public String getlastName() {
	   return lastName;
   }
   
   public void setLastName(String lastName) {
	   this.lastName = lastName;
   }
   
   public String getEmail() {
	   return email;
   }
   
   public void setEmail(String email) {
	   this.email = email;
   }
   
   public String getPassword() {
	   return password;
   }
   public void setPassword(String password) {
	   this.password = password;
   }
  }

