package com.practice.test;
class Ram implements Cloneable{
	int i=10;
	int j=20;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
class cloningTest {
	
	public static void main(String[] args) throws  CloneNotSupportedException{
		Ram ram=new Ram();
		System.out.println(ram.i+"::"+ram.j); //10::20
		
		Ram r=(Ram)ram.clone();
		r.i=222;
		r.j=111;
		System.out.println(r.i+":::"+r.j); //222:::111
		System.out.println(ram.i+"::"+ram.j);//10::20
		
	}

}
