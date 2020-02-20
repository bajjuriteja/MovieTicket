package com.capgemini.moviticket.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import com.capgemini.moviticket.dao.MovieDB;
import com.capgemini.moviticket.service.MovieService;

public class MovieUi 
{	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
			
		Connection con = MovieDB.getConnection1(); 
		
		System.out.println("enter userid");
		
		Scanner sc = new Scanner(System.in);
		
		int userId = sc.nextInt();
		
		Statement st = con.createStatement();
		
		if(userId<=0)
		{
			System.out.println("userid is invalid");
		}
		else
		{
			ResultSet r = st.executeQuery("select * from admin where useid = "+userId);
			
			if(r.next())
			{
				System.out.println("enter password");
				
				String x = sc.next();
				
				if(x.length()<8)
				{
					System.out.println("password is too short");
					return;
				}
				else
				{
					if(x.equals(r.getString(2)))
					{
						System.out.println("press\n\n\n 1:Add Theater\n\n 2:Delete Theater\n\n 3:Add Movie \n \n 4:Delete Movie\n \n 5:Add Screen \n \n 6:Delete Screen \n \n 7:Add Show \n \n 8: Delete Show");
						
						int select = sc.nextInt();
						
						switch(select)
						{
							
						case 1:
							
							System.out.println("enter theater id");
							
							int theaterId = sc.nextInt();
						
							System.out.println("enter theaterName");
						
							String theaterName = sc.next();
						
							System.out.println("enter theater city");
						
							String theaterCity = sc.next();
						
							LinkedHashSet<Integer> movies = new LinkedHashSet<Integer>();
							
							System.out.println("enter number of movies");
						
							int n=sc.nextInt();
							
							for(int i=0;i<n;i++)
							{
								Integer m = sc.nextInt();
								
								movies.add(m);
							}
						
							System.out.println("enter number of screens");
							
							LinkedHashSet<Integer> screens = new LinkedHashSet<Integer>();
							
							n=sc.nextInt();
							
							for(int i=0;i<n;i++)
							{
								Integer s = sc.nextInt();
								
								screens.add(s);
							}
							
							System.out.println("enter manager name");
							
							String managerName = sc.next();
							
							System.out.println("enter manager contact");
							
							String managerContact = sc.next();
							
							MovieService s = new MovieService();
							
							int updateCount = s.addTheater(theaterId, theaterName, theaterCity, movies, screens, managerName, managerContact);
							
							System.out.println( "updated" );
							break;
							
							
							
							
							
							
							
							
							
						}
						
						
						
						
						
					}
					else
					{
						System.out.println("password is incorrect");
						return;
					}
				}
				
			}
			
			
		}
			
					
	
	}
}
	
