package com.learnCoding.StaticBlock;

public class StaticBlockDemo {

	public static void main(String[] args) {
		//StaticBlockDemo d = new StaticBlockDemo();
	}
	public StaticBlockDemo() {
		System.out.println("This is Constructor");
		System.out.println("This will Execute Third");
		System.out.println();
	}
	{	//this is an Instance Block and this will print only when an object is created
		System.out.println("This is Instance Block");
		System.out.println("This will Execute Second");
		System.out.println();
	}

	static {
		System.out.println("This is Static Block");
		System.out.println("This will Execute First");
		System.out.println();
	}
}
