package com.online;

public class Address {
int aId;
String street;
String city;
String state;
String country;

public Address()
{
	
}
public Address(String street, String city, String state, String country) {
	super();
	this.street = street;
	this.city = city;
	this.state = state;
	this.country = country;
}
public int getaId() {
	return aId;
}
public void setaId(int aId) {
	this.aId = aId;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
