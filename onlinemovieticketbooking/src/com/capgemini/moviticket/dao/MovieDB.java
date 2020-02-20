package com.capgemini.moviticket.dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MovieDB {

	
	public static Connection getConnection1() throws ClassNotFoundException, SQLException
	{
		String drivername = "oracle.jdbc.OracleDriver";
		
		Class.forName(drivername);
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","CVSR","CVSR123");
		
		return conn;
		
	}
	
	
}
