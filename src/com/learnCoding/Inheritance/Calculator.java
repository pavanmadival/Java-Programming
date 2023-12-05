package com.learnCoding.Inheritance;
//Example of Multilevel Inheritance
public class Calculator {

	public static void main(String[] args) {
		Third ref = new Third();
		ref.add();
		ref.sub();
		ref.mul();
		ref.div();
		ref.mod();
	}

}

class First{
	void add() {
		int a = 10, b = 20;
		int c = a + b;
		System.out.println("Sum of a and b = " +c);
	}
	void sub() {
		int a = 20, b = 10;
		int c = a - b;
		System.out.println("Diff of a and b = " +c);
	}
}
class Second extends First{
	void mul() {
		int a = 10, b = 20;
		int c = a * b;
		System.out.println("Mul of a and b = " +c);
	}
	void div() {
		int a = 10, b = 2;
		int c = a / b;
		System.out.println("Div of a and b = " +c);
	}
}
class Third extends Second{
	void mod() {
		int a = 10, b = 3;
		int c = a % b;
		System.out.println("Mod of a and b = " +c);
	}
}