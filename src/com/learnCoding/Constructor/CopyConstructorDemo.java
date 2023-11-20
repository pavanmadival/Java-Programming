package com.learnCoding.Constructor;
// Copy constructor using Default constructor
public class CopyConstructorDemo {

	public static void main(String[] args) {
		Copy r = new Copy();
		Copy r1 = new Copy(r);
		
	}

}
class Copy{
	int a; String b;
	Copy(){
		a = 10;
		b = "Pavan";
		System.out.println(a + " " + b);
	}
	Copy(Copy ref){	//copy Constructor
		a = ref.a;
		b = ref.b;
		System.out.println("Copied constructor: ");
		System.out.println(a + " " + b);
	}
}
