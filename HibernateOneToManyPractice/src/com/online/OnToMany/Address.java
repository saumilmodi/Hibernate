package com.online.OnToMany;

import java.util.List;

public class Address {
private int aid;
private String aptname;
private String street;
private List<Employee> employee;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
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
public List<Employee> getEmployee() {
	return employee;
}
public void setEmployee(List<Employee> employee) {
	this.employee = employee;
}

}
