package com.capgemini.moviticket.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashSet;

public class MovieDAO {

	public int addTheater1(int theaterId, String theaterName,String theaterCity,LinkedHashSet<Integer> movies,LinkedHashSet<Integer> listOfScreens,String managerName,String managerContact) throws ClassNotFoundException, SQLException
	{
		int updateCount=0;
		
		Connection con = MovieDB.getConnection1();
		
		Statement st = con.createStatement();
		
		System.out.println("insert into theater values ("+theaterId+",'"+theaterName+"','"+theaterCity+"',movietable(),'"+managerName+"','"+managerContact+"',screentable())");

		st.execute("insert into theater values ("+theaterId+",'"+theaterName+"','"+theaterCity+"',movietable(),'"+managerName+"','"+managerContact+"',screentable())");
		
		//System.out.println("jghk");
		
		for(Integer i : movies)
		{
			
			st.execute("insert into table(select movies from theater where theaterid="+theaterId+") values ('"+i+"')");  
			
		}
		
		
		for(Integer i : listOfScreens)
		{
			st.execute("insert into table(select screenlist from theater where theaterid="+theaterId+") values ("+i+")");
		}
		
		
		
		return updateCount;
	}
	
	
	
	
}
