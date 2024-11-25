package com_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	public void Create() throws Exception{
		String url = "jdbc:mysql://localhost:3306/batch1200?usessl=false";
		Connection c = DriverManager.getConnection(url, "root", "Root");
		String query = "CREATE TABLE job8 (id INT, name VARCHAR(20));";
		PreparedStatement stm = c.prepareStatement(query);
		stm.execute();
		System.out.println("Table created");
		
	}
	public void Insert() throws Exception{
		String url = "jdbc:mysql://localhost:3306/batch1200?usessl=false";
		Connection c = DriverManager.getConnection(url, "root", "Root");
		String query = "INSERT INTO job8 (id,name) VALUES (1,'Rakesh');";
		PreparedStatement stm = c.prepareStatement(query);
		stm.executeUpdate();
		System.out.println("New Data inserted");
	}
	public void Update() throws Exception {
		String url = "jdbc:mysql://localhost:3306/batch1200?usessl=false";
		Connection c = DriverManager.getConnection(url, "root", "Root");
		String query = "update job8 set name = 'Ram' where id = 1";
		PreparedStatement stm = c.prepareStatement(query);
		stm.executeUpdate();
		System.out.println("New Data inserted");	
	}
	public void FatchDetails() throws Exception{
		String url = "jdbc:mysql://localhost:3306/batch1200?usessl=false";
		Connection c = DriverManager.getConnection(url, "root", "Root");
		String query=" select * from job8;";
		PreparedStatement stm = c.prepareStatement(query);
		ResultSet rs = stm.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("id")+" : "+rs.getString("name"));
		}
	}
	
}
