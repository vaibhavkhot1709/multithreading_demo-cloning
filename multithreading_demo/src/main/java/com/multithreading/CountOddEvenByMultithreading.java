package com.multithreading;

public class CountOddEvenByMultithreading extends Thread {

	public void evenNumber() {
//		System.out.println("Even Numbers are");
//		for(int i=0;i<=20;i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
	}

	public void oddNumber() {
//		System.out.println("Odd Numbers are");
//		for(int i=0;i<=20;i++) {
//			if(i%2!=0) {
//				System.out.println(i);
//			}
//		}
	}

	public void run() {
		System.out.println("Thread start");

		System.out.println("Odd Numbers are");
		for (int i = 0; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args) {
		CountOddEvenByMultithreading coem = new CountOddEvenByMultithreading();
		coem.start();
	}
}
