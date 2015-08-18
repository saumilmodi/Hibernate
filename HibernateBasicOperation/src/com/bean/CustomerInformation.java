package com.bean;

public class CustomerInformation {
int customerId;
String customerName;
String customerEmail;
long customerPhone;

public CustomerInformation()
{
	
}
public CustomerInformation(int customerId, String customerName, String customerEmail,
		long customerPhone) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerEmail = customerEmail;
	}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerEmail() {
	return customerEmail;
}
public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}
}
