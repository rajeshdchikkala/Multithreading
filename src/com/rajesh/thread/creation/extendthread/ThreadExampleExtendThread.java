package com.rajesh.thread.creation.extendthread;

/**
 * 
 * @author rajesh
 * The start() method of Thread class is used to start a newly created thread. It performs the following tasks:

    A new thread starts(with new callstack).
    The thread moves from New state to the Runnable state.
    When the thread gets a chance to execute, its target run() method will run.

 *
 */

public class ThreadExampleExtendThread {

	
	public static void main(String[] args) {
		CreateThread t1=new CreateThread();
		t1.start();
	}

}
