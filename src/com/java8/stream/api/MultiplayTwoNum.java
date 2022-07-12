package com.java8.stream.api;


//write a program to multiply 2 no using functional interface
interface fun{
	public int multiplay(int x,int y);
}

class MultiplayTwoNum {
	public static void main(String[] args) {
		fun f=(a,b)->a*b;
		System.out.println(f.multiplay(6, 7));
	}

}
