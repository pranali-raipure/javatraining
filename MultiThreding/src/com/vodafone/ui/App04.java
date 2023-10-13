package com.vodafone.ui;

class Data {

	synchronized public void print() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " => " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException excep) {
				System.out.println(excep.getMessage());
			}
		}
	}

}

class SyncThread extends Thread {
	Data data;

	public SyncThread(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		data.print();
	}
}

public class App04 {

	public static void main(String[] args) {
		Data obj = new Data();
		SyncThread threadOne, threadTwo;
		threadOne = new SyncThread(obj);
		threadOne.setName("Thread 1");
		threadTwo = new SyncThread(obj);
		threadTwo.setName("Thread 2");
		threadOne.start();
		threadTwo.start();
	}
	
}
