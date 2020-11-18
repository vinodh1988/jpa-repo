package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
@Id
	private Integer eno;
@Column
	private String name;
@Column
	private String desig;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="did")
    Dept dept;
@OneToOne(mappedBy="emp",cascade=CascadeType.ALL)
    Contact contact;
    

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(Integer eno, String name, String desig) {
	super();
	this.eno = eno;
	this.name = name;
	this.desig = desig;
}


public Dept getDept() {
	return dept;
}
public void setDept(Dept dept) {
	this.dept = dept;
}
public Integer getEno() {
	return eno;
}
public void setEno(Integer eno) {
	this.eno = eno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesig() {
	return desig;
}
public void setDesig(String desig) {
	this.desig = desig;
}
public Contact getContact() {
	return contact;
}
public void setContact(Contact contact) {
	this.contact = contact;
}



}
