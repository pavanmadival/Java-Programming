package com.learnCoding.Inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		B r = new B();
		r.Show(); //We r able to access the method of class A with help of B
		r.Disp();
	}

}

class A{
	void Show() {
		System.out.println("Welcome To class A");
	}
}
class B extends A{
	void Disp() {
		System.out.println("Now u are accessing class B");
	}
}