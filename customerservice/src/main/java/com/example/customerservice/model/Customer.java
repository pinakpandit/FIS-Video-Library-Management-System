package com.example.customerservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
int cid;
	@Column
String cust_name;
	@Column
String contact;
	@Column
String addr;
	@Column
String date_reg;
	@Column
String age;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCust_name() {
	return cust_name;
}
public void setCust_name(String cust_name) {
	this.cust_name = cust_name;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public String getDate_reg() {
	return date_reg;
}
public void setDate_reg(String date_reg) {
	this.date_reg = date_reg;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public Customer(int cid, String cust_name, String contact, String addr, String date_reg, String age) {
	super();
	this.cid = cid;
	this.cust_name = cust_name;
	this.contact = contact;
	this.addr = addr;
	this.date_reg = date_reg;
	this.age = age;
}
	public Customer() {
		
	}
}
