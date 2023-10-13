package com.vodafone.ui;

class ThreadCode implements Runnable {
	@Override
	public void run() {
		for(int i=1; i<=50; i++) {
			System.out.println("Child => " + i);
		}
	}
}

public class App03 {

	public static void main(String[] args) {
		System.out.println("In main()");
		
		ThreadCode code = new ThreadCode();		// runnable object
		
		Thread thread = new Thread(code);		// parameter constructor 
		
		thread.start();
		System.out.println("In main() again");
		for(int i=1; i<=50; i++) {
			System.out.println("Main => " + i);
		}
		System.out.println("End of main()");
	}
	}