package com.learnCoding.Constructor;

public class CopyConstructorParameterized {

	public static void main(String[] args) {
		CopyPara r = new CopyPara(100, 200);
		//CopyPara r1 = not needed
		new CopyPara(r);
		
	}

}

class CopyPara{
	int p; int q;
	CopyPara(int a, int b){
		p = a;
		q = b;
		System.out.println(p + " " + q);
	}
	CopyPara(CopyPara ref){
		p = ref.p;
		q = ref.q;
		System.out.println(p + " " + q);
	}
}
