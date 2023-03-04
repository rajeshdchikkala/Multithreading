package com.rajesh.synchronization.withoutSync;

/**
 * 
 * @author rajesh
 * In this example we have two different thread working on two different objects
 * and both will run independent of each other
 * Karthik objects will run independent on both threads ATMThread and GooglePay
 * output:
 * Karthik Account:- 1023487453
	--------------------------------- 
	Account Name 1023487453
	The Account Balance after withdraw 3000
	--------------------------------- 
	Balance is 3000
	--------------------------------- 
	Account Name 1023487453
	The Account Balance after deposit 8000
	--------------------------------- 
	Balance is 8000

 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFCBank karthikAccnt=new HDFCBank(7000);	
		System.out.println("Karthik Account:- "+karthikAccnt.hashCode());
		
		System.out.println("--------------------------------- ");
		
		ATMThread ATM= new ATMThread(karthikAccnt);
		ATM.setName("ATM Thread");
		
		GooglePay GooglePay= new GooglePay(karthikAccnt);
		GooglePay.setName("GooglePay Thread");
		
		ATM.start();
		GooglePay.start();
	}

}
