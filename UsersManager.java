package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsersManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String jdbcURL = "jdbc:mysql://localhost:3306/sampledb";
         String dbUsername = "root";
         String dbPassword = "";
         
//         use for update data
//         String passwords = "javaguy";
//         String fullname = "johnjim";
//         String email = "johnjim@gmail.com";
//         String username = "John";
         
//         use for insertion
//         String fullname = "John Doe";
//         String username = "John";
//         String email = "johndoe@gmail.com";
//         String passwords = "1234567";
         
//         use for delete data
         String username = "John";
         
         
         try {
        	 Connection connection = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword);
        	 
//        	 insertion statement
        	 
//        	 String sql = "INSERT INTO users(username, email, fullname, passwords)"
//        			 + "VALUES(?,?,?,?)";
//        	

//        	 PreparedStatement statement  = connection.prepareStatement(sql);
//        	 statement.setString(1, username); 
//        	 statement.setString(2, fullname); 
//        	 statement.setString(3, email); 
//        	 statement.setString(4, passwords); 
//        	 
//        	 int row = statement.executeUpdate();
//        	 if(row>0) {
//        		 System.out.println("A new user has been inserted sucessfully.");
//        	 }
        	 

//        	 retrive data statement
        	 
//        	 String sql = "SELECT * FROM users";
//        	 Statement statement  = connection.createStatement();
//        	 ResultSet result = statement.executeQuery(sql);
//        	 
//        	 while(result.next()) {
//        		 int userId = result.getInt("user_id");
//        		 String username = result.getString("username");
//        		 String fullname = result.getString("fullname");
//        		 String email = result.getString("email");
//        		 String passwords = result.getString("passwords");
//        		 System.out.println(userId+":"+username + ","+fullname+","+email+","+passwords);
//        	 }
//        	 
//        	 Update data Statement
//        	 String sql = "UPDATE users SET passwords=?, fullname=?, email=? WHERE username=?";
//        	 PreparedStatement statement  = connection.prepareStatement(sql);
//        	 statement.setString(1, passwords);
//        	 statement.setString(2, fullname);
//        	 statement.setString(3, email);
//        	 statement.setString(4, username);
//        	 
//        	 int row = statement.executeUpdate();
//        	 if(row>0) {
//        		 System.out.println("The user's information has been updated.");
//        	 }
        	 
        	 
//        	 Delete data Statement
        	 String sql = "DELETE FROM users WHERE username=?";
        	 PreparedStatement statement = connection.prepareStatement(sql);
        	 statement.setString(1, username);
        	 
        	 int row = statement.executeUpdate();
        	 if(row>0) {
        		 System.out.println("The user's information has been deleted");
        	 }
        		 connection.close();
        	 
         }catch(SQLException ex) {
        	 ex.printStackTrace();
         }
         	
         
         }

}
