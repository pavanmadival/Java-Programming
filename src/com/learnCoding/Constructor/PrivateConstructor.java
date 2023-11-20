package com.learnCoding.Constructor;

public class PrivateConstructor {
	int a = 10;
	String b = "Pavan";
	private PrivateConstructor() {	//private constructor
		System.out.println(a + " " + b);
	}
	public static void main(String[] args) {
		PrivateConstructor p = new PrivateConstructor();
		//can be called from same class only
	}
}
//the below code doesnot work 
//because private const cannot be called from other class
//Class B{
//	public static void main(String[] args) {
//		PrivateConstructor p = new PrivateConstructor();
//	}
//}
