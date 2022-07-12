package com.oops;

class X{
	int i;
	public X(int i) {
		this.i=i;
	}
}
class Y implements Cloneable{
	X x;
	int j;
	public Y(X x,int j) {
		this.x=x;
		this.j=j;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class ShallowCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		X x=new X(100);
		Y y=new Y(x, 200);
		System.out.println(y.x.i+":::::"+y.j);//100:::::200
		
		Y y1=(Y)y.clone();
		y1.j=888;
		y1.x.i=999;
		System.out.println(y.x.i+":::::"+y.j); //999:::::200
		System.out.println(y1.j+"::"+y1.x.i);  //888::999
	}

}
