package com.learnCoding.Constructor;

public class ParameterizedConstructorDemo {

	public static void main(String[] args) {
		A r = new A(100, 200);
		r.Show();
		/*A ref = not needed*/ new A(99, "Pavan");

	}

}
class A{
	int a; int b;
	A(int a, int b){
//		a = a;  does not work
//		b = b;
		this.a = a;
		this.b = b;
	}
	A(int x, String y){
		System.out.println(x + " " + y);
	}
	void Show() {
		System.out.println(a + " " + b);
	}
}
