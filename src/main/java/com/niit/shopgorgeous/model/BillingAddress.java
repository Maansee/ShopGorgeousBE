package com.niit.shopgorgeous.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
@Entity
@Table
public class BillingAddress implements Serializable {

	

	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int billingid;

	@Column
	@NotBlank(message = "{flatno.required}")
	private String flatno;

	@Column
	@NotBlank(message = "{buildingname.required}")
	private String buildingname;

	@Column
	@NotBlank(message = "{localityname.required}")
	private String localityname;

	@Column
	@NotBlank(message = "{landmark.required}")
	private String landmark;

	@Column
	@NotBlank(message = "{cityname.required}")
	private String cityname;
	
	@Column
	@NotBlank(message = "{statename.required}")
	private String statename;

	@Column
	@NotBlank(message = "{countryname.required}")
	private String countryname;

	@Column
	@NotBlank(message = "{zipcode.required}")
	private String zipcode;

	@OneToOne(mappedBy = "billingAddress", cascade = CascadeType.ALL)
	@JsonIgnore
	/*@NotBlank(message = "{user.required}")*/
	private UserCustomer user;

	public int getBillingid() {
		return billingid;
	}

	public void setBillingid(int billingid) {
		this.billingid = billingid;
	}

	public String getFlatno() {
		return flatno;
	}

	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}

	public String getBuildingname() {
		return buildingname;
	}

	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}

	public String getLocalityname() {
		return localityname;
	}

	public void setLocalityname(String localityname) {
		this.localityname = localityname;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public UserCustomer getUser() {
		return user;
	}

	public void setUser(UserCustomer user) {
		this.user = user;
	}
	
}
