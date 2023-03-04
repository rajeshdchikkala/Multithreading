package com.rajesh.synchronization;

public class NetBanking extends Thread{
	private HDFCBank bankAccnt;
	NetBanking(HDFCBank bankAccnt){
		this.bankAccnt=bankAccnt;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Account Name "+ this.bankAccnt.hashCode());
		bankAccnt.profileUpdate();
	}

}
