package com.deadlock;

public class Demo {

	
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public  void running() throws InterruptedException {

		synchronized (this) {
			for(int i=0;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+"  "+i);
				Thread.sleep(1000);
			}
		}
	}
	
}
