package com.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IUser implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 2377965064654427407L;

	@Id
	private String username;
	private String password;
	private String fullName;
	private String email;
	private String gender;
	private boolean isTeacher;

	public IUser() {

	}

	public IUser(String username, String password, String fullName, String email, String gender) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.email = email;
		this.gender = gender;
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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isTeacher() {
		return isTeacher;
	}

	public void setTeacher(boolean isTeacher) {
		this.isTeacher = isTeacher;
	}

}
