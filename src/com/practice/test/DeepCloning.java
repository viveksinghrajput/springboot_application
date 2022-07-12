package com.practice.test;



class Attra {
	int i = 10;
	int j = 20;

	public Attra(int i, int j) {
		this.i = i;
		this.j = j;
	}

}

class DN implements Cloneable {
	Attra a;
	int x = 30;

	public DN(Attra a, int x) {
		this.a = a;
		this.x = x;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Attra a1 = new Attra(a.i, a.j);
		DN d1 = new DN(a1, x);
		return super.clone();
	}
}

class DeepCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Attra a = new Attra(1000, 2000);
		DN d = new DN(a, 3000);
		// before cloning
		System.out.println(d.x + ":::" + d.a.i+"::"+d.a.j); // 10:::20
		DN d1 = (DN) d.clone();
		d1.a.i = 888;
		d1.a.j = 999;
		// After Cloning
		System.out.println(d1.x + "::::" + d1.a.i+"::"+d1.a.j); // 999::::888
		System.out.println(d.x + ":::" + d.a.i+"::"+d.a.j); // 10:::20

	}

}
