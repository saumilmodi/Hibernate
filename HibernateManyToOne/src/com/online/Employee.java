package com.online;

public class Employee {
int eId;
String fname;
String lname;
long salary;
Address aId;

public Employee(String fname, String lname, long salary, Address aId) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.salary = salary;
	this.aId = aId;
}
public Address getaId() {
	return aId;
}
public void setaId(Address aId) {
	this.aId = aId;
}
public int geteId() {
	return eId;
}
public void seteId(int eId) {
	this.eId = eId;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}

}
