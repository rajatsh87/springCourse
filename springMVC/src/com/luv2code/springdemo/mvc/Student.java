package com.luv2code.springdemo.mvc;

import java.util.*;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favoritieLanguage;
	//private List<String> OS;
	private String[]OS;
	
	LinkedHashMap<String,String> countryOptions;
	Student() {
		//OS=new ArrayList<>();
		
		countryOptions=new LinkedHashMap<>();
		
		countryOptions.put("BRA","brazil");
		countryOptions.put("IND","india");
		countryOptions.put("PAK","pakistan");
		countryOptions.put("SL","Sri Lanka");
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFavoritieLanguage() {
		return favoritieLanguage;
	}
	public void setFavoritieLanguage(String favoritieLanguage) {
		this.favoritieLanguage = favoritieLanguage;
	}

	public String[] getOS() {
		return OS;
	}

	public void setOS(String[] os) {
//		for(int i=0;i<os.length;i++) {
//			OS.add(os[i]);
//		}
		OS=os;
	}
}
