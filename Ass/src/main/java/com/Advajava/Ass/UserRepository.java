package com.Advajava.Ass;

import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;

public class UserRepository {
	String username="root";
	String password="root";
String url="jdbc:mysql://localhost:3036/demo";
	public Model getValues(int uid){
		
		
		Model obj =new Model();
		obj.setUid(uid);
		try{
		String query="select *from user where uid="+uid;
		Class.forName("com.mysql.jdbc.Driver");
	
		System.out.println("Hello");
		DriverManager.println("I am fine");
		Connection con=DriverManager.getConnection(url, username, password);
		//System.out.println("Hello");
		Statement st=con.createStatement();
		//System.out.println("Hello");
		ResultSet rs=st.executeQuery(query);
		rs.next();
		
		obj.setUsername(rs.getString("username"));
		obj.setAge(rs.getInt("Age"));
con.close();
		}
		catch(Exception e){
		System.out.println(e);
		}
		return obj;
		
		
	
	}
	
	
}