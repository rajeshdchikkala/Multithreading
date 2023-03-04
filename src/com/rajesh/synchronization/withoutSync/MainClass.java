package com.rajesh.synchronization.withoutSync;

/**
 * 
 * @author rajesh
 * In this example we have two different thread working on two different objects
 * and both will run independent of each other
 * Karthik and shankar objects will run independent on both threads ATMThread and GooglePay
 * output:
 * Karthik Account:- 1023487453
   Shankar Account:- 1651191114
	--------------------------------- 
	Account Name 1023487453
	The Account Balance after withdraw 3000
	--------------------------------- 
	Balance is 3000
	--------------------------------- 
	Account Name 1651191114
	The Account Balance after deposit 15000
	--------------------------------- 
	Balance is 15000
	--------------------------------- 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFCBank karthikAccnt=new HDFCBank(7000);	
		System.out.println("Karthik Account:- "+karthikAccnt.hashCode());
		
		HDFCBank ShankarAccnt=new HDFCBank(10000);
		System.out.println( "Shankar Account:- "+ShankarAccnt.hashCode());
		
		System.out.println("--------------------------------- ");
		
		ATMThread ATM= new ATMThread(karthikAccnt);
		ATM.setName("ATM Thread");
		
		GooglePay GooglePay= new GooglePay(ShankarAccnt);
		GooglePay.setName("GooglePay Thread");
		
		/*PhonePe PhonePe= new PhonePe(karthikAccnt);
		PhonePe.setName("PhonePe Thread");
		NetBanking NetBanking= new NetBanking(karthikAccnt);
		NetBanking.setName("NetBanking Thread");*/
		
		ATM.start();
		GooglePay.start();
		/*PhonePe.start();
		NetBanking.start();*/
	}

}
