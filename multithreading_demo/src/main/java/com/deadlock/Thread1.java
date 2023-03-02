package com.deadlock;

public class Thread1 extends Thread {
	Demo d;
	public Thread1(Demo d) {
		super();
		this.d = d;
	}

	public void run() {
		System.out.println("Thread1 is runing");
		try {
			d.running();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
