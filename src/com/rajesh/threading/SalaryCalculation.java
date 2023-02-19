package com.rajesh.threading;

public class SalaryCalculation implements Runnable {
	
	private Employee e=null;
	SalaryCalculation(Employee e){
		this.e=e;
	}

	@Override
	public void run() {
		salaryCalc();
	}
	
	void salaryCalc() {
	    int salary=	e.getBasicSalary()*e.getNoOfdays();
	    e.setSalary(salary);
	}

}
