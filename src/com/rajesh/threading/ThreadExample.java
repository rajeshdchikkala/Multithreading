package com.rajesh.threading;


public class ThreadExample extends Thread{

	public static void main(String[] args) {
		
		ThreadExample t1= new ThreadExample();
		t1.start();
		//t1.start();
		ThreadExample t2= new ThreadExample();
		t2.start(); //responsible for creating indepenent path of execution
	}
	
	@Override
	public void run() {
		System.out.println(" Execution");
		calculateSalary();
	}

	private void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println(" calculate");
	}
	
}
