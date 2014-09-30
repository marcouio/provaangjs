package com.molinari.prova.service.users;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Utente {

	private String firstname;
	private String Surname;
	private String usermame;
	private String password;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getUsermame() {
		return usermame;
	}
	public void setUsermame(String usermame) {
		this.usermame = usermame;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
