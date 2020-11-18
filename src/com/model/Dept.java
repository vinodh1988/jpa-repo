package com.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept")
public class Dept {
@Id
	 private Integer did;
@Column 
	 private String name;

@OneToMany(mappedBy="dept",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
     Set<Employee> eset;
public Dept() {
	super();
	// TODO Auto-generated constructor stub
}
public Dept(Integer did, String name) {
	super();
	this.did = did;
	this.name = name;
}

public Set<Employee> getEset() {
	return eset;
}
public void setEset(Set<Employee> eset) {
	this.eset = eset;
}
public Integer getDid() {
	return did;
}
public void setDid(Integer did) {
	this.did = did;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
