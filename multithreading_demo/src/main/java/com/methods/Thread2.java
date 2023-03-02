package com.methods;

public class Thread2  extends Thread{

	Demo d;
	
	public Thread2(Demo d) {
		super();
		this.d = d;
	}

	public void run() {
//		System.out.println(Thread.currentThread().getName());
		try {
			d.m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
