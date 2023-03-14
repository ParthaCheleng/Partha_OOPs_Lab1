package com.main;
import java.util.*;
import com.service.*;
import com.employee.*;
public class Application {
   
   public static void main(String[] args) {
	 int option;
	 String department = "";
	 String generatedEmail;
	 String generatedPassword = "";
	 Scanner sc = new Scanner(System.in);
	 Employee emp = new Employee("Harshit", "Choudary");
	 CredentialService cs = new CredentialService();
	 
	   
	System.out.println("Determine your department: ");
	System.out.println("1. Technical ");
	System.out.println("2. Admin ");
	System.out.println("3. Human Resource ");
	System.out.println("4. Legal ");
	
	 option = sc.nextInt();
	 
	 switch(option) {
	 case 1: department = "tech";
	 break;
	 case 2: department = "admin";
	 break;
	 case 3: department = "hr";
	 break;
	 case 4: department = "legal";
	 break;
	 default: System.out.println("Option not available");
	 }
	 
	 generatedEmail = cs.generateEmailAddress(emp, department);
	 generatedPassword = cs.generatePassword();
	 emp.setEmail(generatedEmail.toLowerCase());
	 emp.setPassword(generatedPassword);
	 
	 cs.showCredentials(emp);
	 
	 sc.close();
	}
}

