package com.deadlock;

class Test1 extends Thread {
	static Thread mt;

	public void run() {
//		System.out.println("hii");
//		try {
//			mt.join();
//		} catch (InterruptedException e) {
		System.out.println("Exception occure");

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
//		}
	}
}

public class Threaddddddd {

	public static void main(String[] args) throws InterruptedException {

		Test1.mt = Thread.currentThread();

		Test1 t1 = new Test1();
		t1.start();
//		t1.join();
		System.out.println(t1.getName());

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}

		/*
		 if we run program as it is then it become Dead Lock ....
		 if we comment 27 line then only main thread is able to execute the code....
		 
		 if we comment line 8,9,10 then exceptio get occure at line 11 and code execute by main thread and Thread t1  
		 one by one 
		 and addition to that ^^^ if we comment line 27 then we can not pridect the out put
		 
		 */
		
	}
}
