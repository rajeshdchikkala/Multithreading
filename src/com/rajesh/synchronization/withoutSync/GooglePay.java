package com.rajesh.synchronization.withoutSync;

public class GooglePay extends Thread {
	private HDFCBank bankAccnt;
	public GooglePay(HDFCBank bankAccnt) {
		// TODO Auto-generated constructor stub
		this.bankAccnt=bankAccnt;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Account Name "+ this.bankAccnt.hashCode());
		
		bankAccnt.deposit(5000);
		
		bankAccnt.balanceCheck();
	}
}
