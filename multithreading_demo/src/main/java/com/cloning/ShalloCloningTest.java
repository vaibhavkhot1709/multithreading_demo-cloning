package com.cloning;

class Cat{
	int j;

	public Cat(int j) {
		super();
		this.j = j;
	}

	@Override
	public String toString() {
		return "Cat [j=" + j + "]";
	}
	
	
}
class Dog implements Cloneable{
	Cat c;
	int i;
	public Dog(Cat c, int i) {
		super();
		this.c = c;
		this.i = i;
	}
	@Override
	public String toString() {
		return "Dog [cat c=" + c + ", dog i=" + i + "]";
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class ShalloCloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Cat c1=new Cat(11);
		Dog d1=new Dog(c1,99);
		
		
		System.out.println("before d1 >>: "+d1);
		
		
		Dog d2=(Dog) d1.clone();
		
		System.out.println("before d2 >>: "+d2);
		System.out.println(">>>>>>>>>>>>>>");
		
		d1.c.j=00;
		d2.i=88;
		
		System.out.println("After d1 >>: "+d1);
		System.out.println("After d2 >>: "+d2);
	}
}
