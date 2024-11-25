package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class B {
	public static void Create(String url) throws SQLException {
		Connection c = DriverManager.getConnection(url, "root", "Root");
		String query = "CREATE TABLE job5 (id INT, name VARCHAR(20));";
		PreparedStatement stm = c.prepareStatement(query);
		stm.execute();
		System.out.println("Table created");
	}
	public static void Insert(String url) {
		try {
			Connection c = DriverManager.getConnection(url, "root", "Root");
			String query = "INSERT INTO job5 (name, sal) VALUES ('Ram', 6500);";
			PreparedStatement stm = c.prepareStatement(query);
			stm.executeUpdate();
			System.out.println("New Data inserted");

		} catch (Exception e) {
			System.out.println("not created");
		}

	}
	public static void FeatchallData(String url) {
		try {
			Connection c = DriverManager.getConnection(url, "root", "Root");
			String query=" select * from abc;";
			PreparedStatement stm = c.prepareStatement(query);
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" : "+rs.getString("name")+" : "+rs.getInt("sal"));
			}
			
		} catch (Exception e) {
			
		}
	}

	public static void Update(String url) {
		try {
			Connection c = DriverManager.getConnection(url, "root", "Root");
			String query = "update ABc set sal = 34000 where id = 10";
			PreparedStatement stm = c.prepareStatement(query);
			stm.executeUpdate();
			System.out.println("Database Updated");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/batch1200?usessl=false";
		Create(url);
		Insert(url);
		Update(url);
		FeatchallData(url);

	}

}
