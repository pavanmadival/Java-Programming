package com.learnCoding.StaticBlock;

public class InstanceBlock {
	int a,b;
	
	{	//Instance Block
		a = 10;
		b = 20;
		System.out.println(a + " " + b);
	}
	
	InstanceBlock(){	//Constructor
		a = 30;
		b = 40;
		System.out.println(a + " " + b);
	}
	
	void Show() {		//Method
		a = 40;
		b = 50;
		System.out.println(a + " " + b);
	}
	
	static void ShowNew() {		//Static method
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		//InstanceBlock.ShowNew();
		InstanceBlock i = new InstanceBlock();
		i.Show();
		InstanceBlock.ShowNew();
		
	}
}
