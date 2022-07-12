package com.oops;

class Cat{
	int j;
	Cat(int j){
		this.j=j;
	}
}
class Dog implements Cloneable{
	Cat c;
	int i;
	public Dog(Cat c, int i) {
		this.c=c;
		this.i=i;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Cat c1=new Cat(c.j);
		Dog d2=new Dog(c1, i);
		return d2;
	}
}
class DeepCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat c=new Cat(20);
		Dog d=new Dog(c, 10);
		//before cloning
		System.out.println(d.i+":::"+d.c.j);  //10:::20
		Dog d1=(Dog)d.clone();
		d1.c.j=888;
		d1.i=999;
		//After Cloning
		System.out.println(d1.i+"::::"+d1.c.j);  //999::::888
		System.out.println(d.i+":::"+d.c.j);     //10:::20
	}

}
