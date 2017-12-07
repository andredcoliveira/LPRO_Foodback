package com.lpro.fbrest.core;

import java.security.Principal;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Establishment implements Principal{
	
	@JsonProperty
	private Integer id;
	
	@JsonProperty
	private String name;

	@JsonProperty
	private Integer id_cat;
	
	@JsonProperty
	private String address;
	
	@JsonProperty
	private String zone;
	
	@JsonProperty
	private String city;
	
	@JsonProperty
	private String email;
	
	@JsonProperty
	private Integer contact;
	
	@JsonProperty
	private String username;
	
	@JsonProperty
	private String password;
	
	@JsonProperty
	private Date open_date;     //tipo de variavel??
	
	@JsonProperty
	private Boolean delivey;
	
	@JsonProperty
	private Integer price;
	
	@JsonProperty
	private Integer schedule1;
	
	@JsonProperty
	private Integer schedule2;
	
	public Establishment() {
		super();
	}
	
	
	//Constructor
	public Establishment(Integer id, String name, Integer id_cat, String address, String zone, String city, String email,
			Integer contact, String username, String password, Date open_date, Boolean delivey, Integer price,
			Integer schedule1, Integer schedule2) {
		super();
		this.id = id;
		this.name = name;
		this.id_cat = id_cat;
		this.address = address;
		this.zone = zone;
		this.city = city;
		this.email = email;
		this.contact = contact;
		this.username = username;
		this.password = password;
		this.open_date = open_date;
		this.delivey = delivey;
		this.price = price;
		this.schedule1 = schedule1;
		this.schedule2 = schedule2;
	}

	
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getId_cat() {
		return id_cat;
	}



	public void setId_cat(Integer id_cat) {
		this.id_cat = id_cat;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getZone() {
		return zone;
	}



	public void setZone(String zone) {
		this.zone = zone;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Integer getContact() {
		return contact;
	}



	public void setContact(Integer contact) {
		this.contact = contact;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Date getOpen_date() {
		return open_date;
	}



	public void setOpen_date(Date open_date) {
		this.open_date = open_date;
	}



	public Boolean getDelivey() {
		return delivey;
	}



	public void setDelivey(Boolean delivey) {
		this.delivey = delivey;
	}



	public Integer getPrice() {
		return price;
	}



	public void setPrice(Integer price) {
		this.price = price;
	}



	public Integer getSchedule1() {
		return schedule1;
	}



	public void setSchedule1(Integer schedule1) {
		this.schedule1 = schedule1;
	}



	public Integer getSchedule2() {
		return schedule2;
	}



	public void setSchedule2(Integer schedule2) {
		this.schedule2 = schedule2;
	}

}
