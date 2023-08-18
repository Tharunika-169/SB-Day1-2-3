package com.example.demo.model;

public class Student {
  private int id;
  private String name;
  private String dept;
  private String mailid;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, String dept, String mailid) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.mailid = mailid;
}
  
}
