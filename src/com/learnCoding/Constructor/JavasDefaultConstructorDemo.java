package com.learnCoding.Constructor;

public class JavasDefaultConstructorDemo {

	public static void main(String[] args) {
		D obj = new D();
		obj.Show();

	}

}

class D{
	int a;
	String name;
	char c;
	float f;
	double d;
	
	//no constructor but java's default const is created by compiler
	void Show() {
		System.out.println("Integer--> " + a +'\n'+ "String--> " + name +'\n'+ "Char--> " + c +'\n'+ "Float--> " + f +'\n'+ "Double--> " + d);
		System.out.println("value is defaultly assigned by the compiler \n without constructor method ");
	}
}
/*
 * class A{
 * 
 * }
 * after compiling it becomes
 * class A{
 * 		A(){
		}
	}
*/