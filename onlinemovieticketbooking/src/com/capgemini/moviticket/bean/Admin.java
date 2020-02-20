package com.capgemini.moviticket.bean;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Admin {

	private int userId;
	
	private String adminName;
	
    private String password;
    
    private String contact;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
}










class Theater
{
	
	private int theaterId;

	private String theaterName;
	
	private String theaterCity;
	
	private LinkedHashSet movies;
	
	private LinkedHashSet listOfScreens;
	
	private String managerName;
	
	private String managerContact;
	
	public int getTheaterId() {
		return theaterId;
	}
	
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	
	public String getTheaterName() {
		return theaterName;
	}
	
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	
	public String getTheaterCity() {
		return theaterCity;
	}
	
	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}
	
	public Set getMovies() {
		return movies;
	}
	
	public void setMovies(LinkedHashSet movies) {
		this.movies =  movies;
	}
	
	public Set getListOfScreens() {
		return listOfScreens;
	}
	
	public void setListOfScreens(LinkedHashSet listOfScreens) {
		this.listOfScreens = listOfScreens;
	}
	
	public String getManagerName() {
		return managerName;
	}
	
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	public String getManagerContact() {
		return managerContact;
	}
	
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}	
}




class Movie
{
	private int	movieId;
	
	private String	movieName;
	
	private String	movieDirector;
	
	private String	movieLength;
	
	private Set	languages;
	
	private String	movieReleaseDate;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public String getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(String movieLength) {
		this.movieLength = movieLength;
	}

	public Set getLanguages() {
		return languages;
	}

	public void setLanguages(Set languages) {
		this.languages = languages;
	}

	public String getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public void setMovieReleaseDate(String movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}

}



class Screen
{
	private int	screenId;
	
	private int	theatreId;
	
	private String screenName;
	
	private Set	showList;
	
	private String movieEndDate;
	
	private int	rows;
        
	private int columns;

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public Set getShowList() {
		return showList;
	}

	public void setShowList(Set showList) {
		this.showList = showList;
	}

	public String getMovieEndDate() {
		return movieEndDate;
	}

	public void setMovieEndDate(String movieEndDate) {
		this.movieEndDate = movieEndDate;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
}







class Show
{
	
	private String showId;
	
	private String showStartTime;
	
	private String showEndTime;
	
	private Set	seats;
	
	private String showName;
	
	public String movieName;
	
	private int	screenId;
	
	private int theaterId;

	public String getShowId() {
		return showId;
	}

	public void setShowId(String showId) {
		this.showId = showId;
	}

	public String getShowStartTime() {
		return showStartTime;
	}

	public void setShowStartTime(String showStartTime) {
		this.showStartTime = showStartTime;
	}

	public String getShowEndTime() {
		return showEndTime;
	}

	public void setShowEndTime(String showEndTime) {
		this.showEndTime = showEndTime;
	}

	public Set getSeats() {
		return seats;
	}

	public void setSeats(Set seats) {
		this.seats = seats;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}

}
