package com.Driver.Main;

import com.services.Admin.Admin_Department;
import com.services.Hr.Hr_Department;
import com.services.Super.Super_Department;
import com.services.Tech.Tech_Department;



public class DriverClass {
	public static void main(String[] args) {
		
        //Create object of Super class and Print functionalities of Super Class
		
		Super_Department Super = new Super_Department();
		
	    System.out.println("\nWelcome to " +Super.departmentName());
		System.out.println("Today's Work : " +Super.getTodayswork());
		System.out.println("Work Deadline: " +Super.getworkdeadline());
		System.out.println("Holiday Information : " +Super.istodayaHoliday());
	    
       
        
		// Create Object of Admin_Department  Class and Print Functionalities of admin_Department 
		
		Admin_Department Admin=new Admin_Department();
	   
		System.out.println("\nWelcome to " +Admin.departmentName());
		System.out.println("Today's Work : "+Admin.getTodayswork());
		System.out.println("Work Deadline: " +Admin.getworkdeadline());
		System.out.println("Holiday Information : " +Admin.istodayaHoliday());  // print "today is holiday or not" using the Super Department.
		
		
		
		// Create Object of Hr_Departemnt class and Print Functionalities of Hr_Department
		
		Hr_Department HR=new Hr_Department();
		
		System.out.println("\nWelcome to "+HR.departmentName());
		System.out.println("Today's Work : "+HR.getTodayswork());
		System.out.println("Activity :" +HR.doActivity());
		System.out.println("Work Deadline: " +HR.getworkdeadline());
	 	System.out.println("Holiday Information : " +HR.istodayaHoliday());  // print "today is holiday or not" using the Super Department.
		 
		
		
		
		// Create object of the Tech_Department class and Print the Functionalities
		 
		Tech_Department Tech= new Tech_Department();
		
		System.out.println("\nWelcome to "  +Tech.departmentName());
		System.out.println("Today's Work : " +Tech.getTodayswork());
	    System.out.println("Work Deadline: " +Tech.getworkdeadline());
		System.out.println("Stack Information : " +Tech.getTechStackInformation());
	    System.out.println("Holiday Information : " +Tech.istodayaHoliday());   // print "today is holiday or not" using the Super Department. 
		
        
	}
}

