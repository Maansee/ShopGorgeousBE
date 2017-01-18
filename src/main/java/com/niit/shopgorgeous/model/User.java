package com.niit.shopgorgeous.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class User {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@Size(min = 4, max = 16)
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	//@NotBlank (message = "Enter a valid User Name !")
	private String name;
	
//	@Size(min = 4, max = 16)
//	@NotBlank (message = "Enter a password!")
	private String password;
//	
//	@Size(min = 10, max = 12)
//	@NotBlank (message = "Enter a valid number")
	private String mobile;
	
	private String mailid;
	

	private String role;
	
	
}
