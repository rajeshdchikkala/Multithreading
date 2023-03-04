package com.rajesh.synchronization;

/**
 * 
 * @author rajesh
 * 
 * In below code lock is happening on the object.
 * when karthikAccnt is trying to access  withdraw method which is synchronized
 * it will acquire lock by ATM thread. Other thread who wants to access the karthikAccnt will have 
 * to wait to get access. same for ShankarAccnt which s trying to access deposit method using googlepay thread.
 * in Simple words
 * Thread T1 is trying to access method m1 using object a. Thread t2 wants to access m2 method using object 
 * a will have to wait to get access. as T1 has locked the object a.
 * 
 * But Thread T1 is trying to access method m1 using object a. Thread t2 wants to access m2 method using object b.
 * in this scenario both threads are running on different objects so there will be no issues.
 *
 *output:
 *  Karthik Account:- 1023487453
	--------------------------------- 
	Shankar Account:- 1651191114
	--------------------------------- 
	Account Name 1023487453
	The Account Balance after withdraw 3000
	Balance is 3000
	--------------------------------- 
	Account Name 1651191114
	The Account Balance after deposit 15000
	Balance is 15000
	--------------------------------- 
	Account Name 1023487453
	Balance is 3000
	--------------------------------- 
	Account Name 1023487453
	Profile Update
	--------------------------------- 
 */
public class MainClass {
	public static void main(String[] args) {

		HDFCBank karthikAccnt = new HDFCBank(7000);
		System.out.println("Karthik Account:- "+karthikAccnt.hashCode());
		System.out.println("--------------------------------- ");
		HDFCBank ShankarAccnt = new HDFCBank(10000);
		System.out.println( "Shankar Account:- "+ShankarAccnt.hashCode());
		System.out.println("--------------------------------- ");
		ATMThread ATM = new ATMThread(karthikAccnt);
		ATM.setName("ATM Thread");
		
		GooglePay GooglePay = new GooglePay(ShankarAccnt);
		GooglePay.setName("GooglePay Thread");
		PhonePe PhonePe = new PhonePe(karthikAccnt);
		PhonePe.setName("PhonePe Thread");
		NetBanking NetBanking = new NetBanking(karthikAccnt);
		NetBanking.setName("NetBanking Thread");

		ATM.start();
		GooglePay.start();
		PhonePe.start();
		NetBanking.start();

	}
}
