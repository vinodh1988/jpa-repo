package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {
  @Id
     private Integer eno;
  @Column
     private String street;
  @Column
  	 private String city;
  
  @Column
     private String mobile;
  @OneToOne(cascade=CascadeType.ALL)
  @PrimaryKeyJoinColumn
  Employee emp;

public Contact() {
	super();
	// TODO Auto-generated constructor stub
}

public Contact(Integer eno, String street, String city, String mobile) {
	super();
	this.eno = eno;
	this.street = street;
	this.city = city;
	this.mobile = mobile;
}


public Employee getEmp() {
	return emp;
}

public void setEmp(Employee emp) {
	this.emp = emp;
}

public Integer getEno() {
	return eno;
}

public void setEno(Integer eno) {
	this.eno = eno;
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

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}
  
  
}
