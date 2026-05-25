package com.tennis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "Grounds")
public class Ground {

  @Id
  @Column(name = "GROUNDID")
  private int groundId;
	
  @Column(name = "FULLNAME")
  private String fullname;

  @Column(name = "SHORTNAME")
  private String shortname;

  @Column(name = "CITY")
  private String city;

  @Column(name = "COUNTRY")
  private String country;

public int getGroundId() {
	return groundId;
}

public void setGroundId(int groundId) {
	this.groundId = groundId;
}

public String getFullname() {
	return fullname;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}

public String getShortname() {
	return shortname;
}

public void setShortname(String shortname) {
	this.shortname = shortname;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

@Override
public String toString() {
	return "Ground [groundId=" + groundId + ", fullname=" + fullname + ", shortname=" + shortname + ", city=" + city
			+ ", country=" + country + "]";
}
 
}