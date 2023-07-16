package com.example.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	String id;
	String name;
	String branch;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
	
	
}


