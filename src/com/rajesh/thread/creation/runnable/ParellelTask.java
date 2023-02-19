package com.rajesh.thread.creation.runnable;

public class ParellelTask implements Runnable {

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() +" is executing here");
	}

}
