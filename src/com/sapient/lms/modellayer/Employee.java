package com.sapient.lms.modellayer;
import java.util.*;
public class Employee {
	int id;
	String name;
	String dept;
	private Leavedetails leavedetails;
	public Employee(int id, String name, String dept){
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.leavedetails=new Leavedetails();
	}
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
	public Leavedetails getLeavedetails() {
		return leavedetails;
	}
	public void setLeavedetails(Leavedetails leavedetails) {
		this.leavedetails = leavedetails;
	}
}

