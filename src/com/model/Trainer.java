package com.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="trainer")
public class Trainer {
	@Id
	  private Integer tid;
	@Column
	  private String tname;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="course_trianer" ,joinColumns=@JoinColumn(name="tid"),inverseJoinColumns=@JoinColumn(name="cid"))
	Set<Course> course;
	
	
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(Integer tid, String name) {
		super();
		this.tid = tid;
		this.tname = name;
	}
	
	public Set<Course> getCourse() {
		return course;
	}
	public void setCourse(Set<Course> course) {
		this.course = course;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String name) {
		this.tname = name;
	}
	
	
	
	
	

}
