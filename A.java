package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class A {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url =  "jdbc:mysql://localhost:3306/batch1200?usessl=false";
		String user_name="root";
		String password="Root";
		Connection c = DriverManager.getConnection(url, user_name, password);
		String query="INSERT INTO ABC (name, sal) VALUES ('Ramesh', 69690);";
		PreparedStatement stm = c.prepareStatement(query);
		stm.executeUpdate();
		System.out.println("Database Updated");

	}

}
