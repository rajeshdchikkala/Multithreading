package com.rajesh.thread.creation.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadExampleUsingCallable {

	public static void main(String[] args) {
		
		try {
			Callable<String> c = () -> {
				System.out.println(Thread.currentThread().getName());
				return "true";
			};
			
			FutureTask<String> ft = new FutureTask<String>(c);
			Thread t = new Thread(ft);
			t.start();

			String result = ft.get();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
