package com.bridgelabz.beanlifecycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDao {
	
	//injecting from the beans.xml
	private String driver;
	private String url;
	private String username;
	private String password;
	private Connection con ;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Purpose: this method will be used to establishes connection with the database
	 * 			but @PostConstruct method will be called automatically by the spring 
	 * 			framework
	 * 
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	@PostConstruct
	public void establishConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		con = DriverManager.getConnection(url, username, password);
	}

	public void showRow() throws ClassNotFoundException, SQLException {
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM student");
		while (rs.next()) {
			System.out.println(rs.getString("name"));
		}
		rs.close();
		st.close();
		
	}

	public void deleteRecord(int id) throws ClassNotFoundException, SQLException {
		
		Statement st = con.createStatement();
		st.executeUpdate("DELETE FROM student WHERE id=" + id);
		System.out.println("Record deleted");
		
	}
	@PreDestroy
	public void closeConnection() throws SQLException {
		con.close();
	}

}
