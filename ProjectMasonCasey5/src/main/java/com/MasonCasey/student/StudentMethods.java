package com.MasonCasey.student;

import java.util.ArrayList;

import com.MasonCasey.Database.StudentDB;

public class StudentMethods {

	
	public static boolean userNameExists(String user) {
		
		ArrayList<String> userList = new ArrayList<>();
		try {
			
			userList = StudentDB.getType("UserName");
			
		}  catch(Exception e) {System.out.println(e);}
		System.out.println("Returned List...");
		 
		return !userList.contains(user);
		
	}
	
	//checks to ensure college email
	public static boolean checkEmailCollege(String email) {			
		return email.endsWith(".edu");
	}
}
