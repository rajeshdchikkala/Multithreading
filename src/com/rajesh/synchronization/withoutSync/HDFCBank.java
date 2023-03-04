package com.rajesh.synchronization.withoutSync;

public class HDFCBank {

	int accountBalance;
	
	public HDFCBank(int accountBalance) {
		// TODO Auto-generated constructor stub
		this.accountBalance=accountBalance;
	}
	
	public void withdraw(int withdrawalAmount) {
		accountBalance=this.accountBalance-withdrawalAmount;
		System.out.println("The Account Balance after withdraw "+ this.accountBalance);
		System.out.println("--------------------------------- ");
	}
	
    public void deposit(int amountToBeDeposited) {
		accountBalance=this.accountBalance+amountToBeDeposited;
		System.out.println("The Account Balance after deposit "+ this.accountBalance);
		System.out.println("--------------------------------- ");
	}
	
	public void balanceCheck() {
		System.out.println("Balance is "+this.accountBalance);
		System.out.println("--------------------------------- ");
	}
	
	public void profileUpdate() {
		System.out.println("Profile Update");
	}

}
