package com.capgemini.moviticket.service;

import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Set;

import com.capgemini.moviticket.dao.MovieDAO;

public class MovieService {
	
	public int addTheater(int theaterId, String theaterName,String theaterCity,LinkedHashSet<Integer> movies,LinkedHashSet<Integer> listOfScreens,String managerName,String managerContact) throws ClassNotFoundException, SQLException
	{

		int updateCount=0;
		
		String x = new Integer(theaterId).toString();
		
		int tIdLength=x.length();
		
		
		if( ( x.charAt(0)!='2') || (x.length()<4) )
		{
			System.out.println("Invalid theaterid"+x.length()+x.charAt(0));
			return 0;
		}
		
		for(Integer i: movies)
		{
			 x = i.toString();
			
			if((x.charAt(0)!='3')||(x.length()<4))
			{
				System.out.println("Invalid movieid");
				return 0;
			}
		}
		
		
		for(Integer i: listOfScreens)
		{
			 x = i.toString();
			
			if((x.length()<tIdLength)||(x.substring(0,4).equals(new Integer(theaterId).toString())==false))
			{
				System.out.println("Invalid screenid");
				return 0;
			}
		}
		
		MovieDAO x1 = new MovieDAO();
		
		x1.addTheater1(theaterId, theaterName, theaterCity, movies, listOfScreens, managerName, managerContact);
		
		
		
		
		
		
		
		
		

		return updateCount;
	}
	

}
