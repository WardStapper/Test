package com.example.demo.model;


import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.GEneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 

public class Klant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id; 
	
	
	@Column
	private String name; 
	
	private String lastname; 
	
	private String stad; 
	
	private String straat; 
	
	private String eMail; 
	
	private String username;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getStad() {
		return stad;
	}

	public void setStad(String stad) {
		this.stad = stad;
	}

	public String getStraat() {
		return straat;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	} 

}
