package com.example.demo.model;


import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.GEneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 

@Entity
public class Login {

@Id
@GeneratedValue(strategy = GenerationType.IIDENTITY)
private long id; 

@Column
private String username; 

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassWord() {
	return passWord;
}

public void setPassWord(String passWord) {
	this.passWord = passWord;
}

public String geteMail() {
	return eMail;
}

public void seteMail(String eMail) {
	this.eMail = eMail;
}

private String passWord; 

private String eMail; 
	
	
}
