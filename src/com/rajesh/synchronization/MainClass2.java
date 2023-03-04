package com.rajesh.synchronization;

/**
 * 
 * @author rajesh
 * 
 * In below code lock is happening on the object.
 * when thread ATMthread tries to access withdraw method. 
 * All other thread has to wait for their turn to get execute method 
 * written in their class.
 * 
 *output:
 *	Karthik Account:- 1023487453
	--------------------------------- 
	Account Name 1023487453
	The Account Balance after deposit 12000
	Balance is 12000
	--------------------------------- 
	Account Name 1023487453
	The Account Balance after withdraw 8000
	Balance is 8000
	--------------------------------- 
	Account Name 1023487453
	Balance is 8000
	--------------------------------- 
	Account Name 1023487453
	Profile Update
	---------------------------------
 */
public class MainClass2 {
	public static void main(String[] args) {

		HDFCBank karthikAccnt = new HDFCBank(7000);
		System.out.println("Karthik Account:- "+karthikAccnt.hashCode());
		System.out.println("--------------------------------- ");
		ATMThread ATM = new ATMThread(karthikAccnt);
		ATM.setName("ATM Thread");
		GooglePay GooglePay = new GooglePay(karthikAccnt);
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
