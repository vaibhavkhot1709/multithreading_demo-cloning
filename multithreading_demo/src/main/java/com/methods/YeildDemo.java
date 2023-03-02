package com.methods;

public class YeildDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Demo d=new Demo();
		Thread1 t1=new Thread1(d);
		Thread2 t2=new Thread2(d);

		t2.setName("t2");
		t1.setName("t1");
		t1.start();
		t2.start();
		t2.setPriority(9);
		t2.setPriority(1);
		
		
		
	}
}
