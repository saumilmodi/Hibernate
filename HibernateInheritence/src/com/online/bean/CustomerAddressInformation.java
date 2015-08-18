package com.online.bean;

public class CustomerAddressInformation extends Customer{
private int aptno;
private String aptname;
private String street;
public int getAptno() {
	return aptno;
}
public void setAptno(int aptno) {
	this.aptno = aptno;
}
public String getAptname() {
	return aptname;
}
public void setAptname(String aptname) {
	this.aptname = aptname;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}

}
