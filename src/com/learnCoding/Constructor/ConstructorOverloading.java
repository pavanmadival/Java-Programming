package com.learnCoding.Constructor;

public class ConstructorOverloading {

	public static void main(String[] args) {
		O r = new O();
		O r1 = new O(100);
		O r2 = new O(200, 20.63);
		System.out.println(r.x + " " + r.y + " " + r.z);
		System.out.println(r1.x);
		System.out.println(r2.y + " " + r2.z);
	}

}

class O{
	int x; int y; double z;
	O(){
		int x = 10;
		int y = 20;
		String z = "Pavan";
	}
	O(int a){
		x = a;
	}
	O(int b, double c){
		y = b;
		z = c;
	}
	
}
