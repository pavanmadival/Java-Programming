package com.learnCoding.java;

public class A {

	public static void main(String[] args) {
		int num = 10;
		int fact = 1;
		while (num > 0) {
			fact = fact * num;
			num = num - 1;
		}
		System.out.println(fact);
	}

}
