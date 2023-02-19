package com.rajesh.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadingWithScheduledPool {

	public static void main(String[] args) {
		//create employee obj
				Employee e= new Employee(121,"Karthick",10000,24);
				Employee e1= new Employee(122,"Rajesh",20000,10);
				Employee e2= new Employee(123,"Rahul",1000,24);
				Employee e3= new Employee(124,"India",2000,24);
				Employee e4= new Employee(125,"Ashok",4000,24);
				Employee e5= new Employee(126,"Vivaan",15000,9);
				Employee e6= new Employee(127,"Yashari",20000,6);
				
				List<Employee> empList=new ArrayList<>();
				empList.add(e);
				empList.add(e1);
				empList.add(e2);
				empList.add(e3);
				empList.add(e4);
				empList.add(e5);
				empList.add(e6);
				
				ExecutorService service=Executors.newScheduledThreadPool(3);
				
				for(int i=0;i<empList.size();i++) {
					SalaryCalculation sc=new SalaryCalculation(empList.get(i));
					service.submit(sc); //class implements runnable
				}
				
				service.shutdown(); //to terminate all threads
				
	}

}
