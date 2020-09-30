package com.blz.pincode;
import java.util.*;
import java.util.regex.*;

public class PINcode 
  {
	public static void main(String[] args)
	  {  
		
		Scanner sc= new Scanner(System.in);
		  
		  //giving output to enter name 
		  System.out.println("Enter pincode");
		  
		  //Taking input from user
		  String pincode= sc.nextLine();
		  
		  String pattern= "^[0-9]{3}\s[0-9]{3}$";
		  Pattern pattenName= Pattern.compile(pattern);
		  Matcher m =pattenName.matcher(pincode);

            sc.close();
		  
		  if(m.matches())
		    { 
			  System.out.println("Pincode is  "+pincode);
		      }
		  else 
		    { 
			  System.out.println("Enter correct pincode");
		    }		 	  
		  
	  }
}
