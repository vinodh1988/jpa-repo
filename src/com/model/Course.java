package com.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="course")
public class Course {
 @Id
   private Integer cid;
 @Column
   private String cname;
 
 @ManyToMany(mappedBy="course",cascade=CascadeType.ALL)
 Set<Trainer> trainers;
 
 
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public Course(Integer cid, String cname) {
	super();
	this.cid = cid;
	this.cname = cname;
}


public Set<Trainer> getTrainers() {
	return trainers;
}
public void setTrainers(Set<Trainer> trainers) {
	this.trainers = trainers;
}
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
 
 
}
