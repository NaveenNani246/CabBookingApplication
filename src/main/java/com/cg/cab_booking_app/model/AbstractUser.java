 package com.cg.cab_booking_app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractUser {

	private String username;
	private String password;
	private String address;
	private String mobileNumber;
	private String email;
	
	public AbstractUser(String username, String password, String address, String mobileNumber, String email) {
		this.username = username;
		this.password = password;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}

	public AbstractUser() {
		
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AbstractUser [username=" + username + ", password=" + password + ", address=" + address
				+ ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
	}
	
	
}
