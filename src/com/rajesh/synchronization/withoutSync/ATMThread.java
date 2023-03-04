package com.rajesh.synchronization.withoutSync;

public class ATMThread extends Thread {
	private HDFCBank bankAccnt;
	ATMThread(HDFCBank bankAccnt){
		this.bankAccnt=bankAccnt;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Account Name "+ this.bankAccnt.hashCode());
		
		bankAccnt.withdraw(4000);
		
		bankAccnt.balanceCheck();
	}
}
