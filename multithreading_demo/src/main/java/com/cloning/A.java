package com.cloning;

class A {
	static {
		try {
			System.out.println("hii");
//			int i = 10 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
	
		A a=new A();
	}
}