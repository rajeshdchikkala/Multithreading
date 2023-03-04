package com.rajesh.synchronization.withoutSync;

/**
 * 
 * @author rajesh
 * In this example we have two different thread working on two different objects
 * and both will run independent of each other
 * in below example main thread is running but 
 * problem here is we are calling methods one after the other
 * so in this case when we are depositing or withdrawing in both case we will be having loss to bank and customer.
 * and to get proper balance we should use threads eg. mainclass and mainclass2
 * output:
 * Karthik Account:- 1023487453
	--------------------------------- 
	Balance is 7000
	--------------------------------- 
	The Account Balance after deposit 17000
	--------------------------------- 
	Balance is 17000
	--------------------------------- 
	The Account Balance after withdraw 10000
	--------------------------------- 
	Balance is 10000
	--------------------------------- 

 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFCBank karthikAccnt=new HDFCBank(7000);	
		System.out.println("Karthik Account:- "+karthikAccnt.hashCode());
		
		System.out.println("--------------------------------- ");
		
		karthikAccnt.balanceCheck();
		karthikAccnt.deposit(10000);
		karthikAccnt.balanceCheck();
		karthikAccnt.withdraw(7000);
		karthikAccnt.balanceCheck();
		
	}

}
