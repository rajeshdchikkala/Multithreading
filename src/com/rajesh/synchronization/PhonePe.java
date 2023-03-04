package com.rajesh.synchronization;

public class PhonePe extends Thread{
	private HDFCBank bankAccnt;
	public PhonePe(HDFCBank bankAccnt) {
		this.bankAccnt=bankAccnt;
	}
	@Override
	public void run() {
		System.out.println("Account Name "+ this.bankAccnt.hashCode());
		bankAccnt.balanceCheck();
	}

}
