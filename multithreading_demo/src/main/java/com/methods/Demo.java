package com.methods;

public class Demo {

	public synchronized void m1() throws InterruptedException {
		System.out.println("execute by " +Thread.currentThread().getName());
//		System.out.println("m1 "+Thread.currentThread().getName());
		
			System.out.println("hiiii "+Thread.currentThread().getName());
			System.out.println("hiiii "+Thread.currentThread().getName());
			System.out.println("hiiii "+Thread.currentThread().getName());

	}
}
