package com.learnCoding.Constructor;

public class ConstructorDemo {
	public static void main(String args[]) {
		C ref = new C();   //<-- here we are calling constructor C()
		ref.Show();
	}
}

class C{
	int a;
	String name;
	//name of the constructor is same as class name
	C(){	//default constructor
		a = 10;
		name = "Pavan";
		a = 20;
	}
	void Show() {
		System.out.println(a + " " + name);
	}
}

