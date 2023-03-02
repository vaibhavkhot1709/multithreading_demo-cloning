package com.deadlock;

public class TestDeadLock {
	
	public static void main(String[] args) {
		Demo d=new Demo();
		Thread1 t1=new Thread1(d);
		t1.setName("T1 >");
		t1.start();
		
		Thread2 t2=new Thread2(d);
		t2.setName("T2 >");
		t2.start();
	}
	
	

}
