package com.rajesh.threading;

public class Employee {
	//fields
	private int basicSalary;
	private int empid;
	private String empName;
	private int salary;
	private int noOfdays;
	
	
	
	public Employee( int empid, String empName, int basicSalary, int noOfdays) {
		super();
		this.basicSalary = basicSalary;
		this.empid = empid;
		this.empName = empName;
		
		this.noOfdays = noOfdays;
	}
	
	
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getNoOfdays() {
		return noOfdays;
	}
	public void setNoOfdays(int noOfdays) {
		this.noOfdays = noOfdays;
	}
	
	

}
