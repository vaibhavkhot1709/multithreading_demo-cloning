package com.methods;

public class Thread1  extends Thread{

	Demo d;
	
	public Thread1(Demo d) {
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
