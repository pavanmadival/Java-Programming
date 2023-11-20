package com.learnCoding.java;

public class Demo1 {
	static int a = 10;
	static String name = "Pavan";
	
	static void Show() {
		System.out.println(a + " " + name);
	}
}

class Demo2{
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.Show();
		//Another way of creating a object
		Demo1 d2;
		d2 = new Demo1();
		
		Demo1.Show();
		d2.Show();

	}
}
