package com.MasonCasey.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentDB {
	
	//creates a student table if none
	public static void createStudentTable() throws Exception{
		try {
			Connection con = Init.getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS students(id int NOT NULL AUTO_INCREMENT, first varchar(255), last varchar(255),email varchar(255),college varchar(255), PRIMARY KEY(id))"
);
			create.executeUpdate();
		} catch(Exception e) {System.out.println(e);}
		finally {System.out.println("fUNCTION COMPLETE.");}
	}
	
	//posts first name to database
	public static void postFirst(String name) throws Exception{
		final String var1 = name;
		try {
			
			Connection con = Init.getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO students(first) VALUES ('"+ var1+"')");
			posted.executeUpdate();		
		} catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("INSERT COMPLETED!");
		}
	}
	
	//posts last name to database
	public static void postLast(String name) throws Exception{
		final String var1 = name;
		try {
			
			Connection con = Init.getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO students(last) VALUES ('"+ var1+"')");
			posted.executeUpdate();		
		} catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("INSERT COMPLETED!");
		}
	}
	
	//posts email name to database
	public static void postEmail(String name) throws Exception{
		final String var1 = name;
		try {
			
			Connection con = Init.getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO students(email) VALUES ('"+ var1+"')");
			posted.executeUpdate();		
		} catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("INSERT COMPLETED!");
		}
	}
	
	//posts college name to database
	public static void postCollege(String name) throws Exception{
		final String var1 = name;
		try {
			
			Connection con = Init.getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO students(college) VALUES ('"+ var1+"')");
			posted.executeUpdate();		
		} catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("INSERT COMPLETED!");
		}
	}
	
	public static void postStudent(String v1, String v2, String v3) throws Exception{
		final String var1 = v1;
		final String var2 = v2;
		final String var3 = v3;
		try {
			
			Connection con = Init.getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO students(first,last,email) VALUES ('"+var1+"','"+var2+"','"+var3+"')");
			posted.executeUpdate();		
		} catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("INSERT COMPLETED!");
		}
	}
	
	//Retrieves all of type something
	public static ArrayList<String> getType(String type) throws Exception{
		try{
			
			String var1 = type;
			Connection con = Init.getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT '"+var1+"' FROM students");
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<String> array = new ArrayList<String>();
			while(result.next()) {

				array.add(result.getString("'var1'"));
			}
			System.out.println("All records have been selected");
			return array;
		} catch (Exception e) {System.out.println(e);}
		return null;
	}

}
