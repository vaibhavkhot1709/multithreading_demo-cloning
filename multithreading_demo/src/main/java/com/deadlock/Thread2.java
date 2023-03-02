package com.deadlock;

public class Thread2 extends Thread {
	Demo d;

	public Thread2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Thread2(Demo d) {
		super();
		this.d = d;
	}

	public void run() {
		System.out.println("Thread2 is runing");
		try {
			d.running();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
