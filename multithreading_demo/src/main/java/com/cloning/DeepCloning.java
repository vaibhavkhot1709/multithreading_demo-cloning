package com.cloning;

class CatDeep {
	int j;

	public CatDeep(int j) {
		super();
		this.j = j;
	}

	@Override
	public String toString() {
		return "Cat [j=" + j + "]";
	}

}

class DogDeep implements Cloneable {
	CatDeep c;
	int i;

	public DogDeep(CatDeep c, int i) {
		super();
		this.c = c;
		this.i = i;
	}

	@Override
	public String toString() {
		return "Dog [c=" + c + ", i=" + i + "]";
	}

	public Object clone() {
		CatDeep cat = new CatDeep(c.j);
		DogDeep dog = new DogDeep(cat, i);
		return dog;
	}
}

public class DeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		CatDeep c1 = new CatDeep(11);
		DogDeep d1 = new DogDeep(c1, 99);

		DogDeep d2 = (DogDeep) d1.clone();
		System.out.println("before d1 : " + d1);
		System.out.println("before d2 : " + d2);
		d1.c.j = 44;
		d2.c.j = 66;

		System.out.println(d1.c.j == d2.c.j);
		System.out.println("after d1: " + d1);
		System.out.println("after d2: " + d2);
	}

}
