package com.learnCoding.java;
import java.util.*;
class Banking{
	int bal = 5000;
	public void Balance(){
		System.out.println(bal);
		System.out.println("*****Transaction Completed*****");
	}
	public void Deposite(int money) {
		bal += money;
		System.out.println("Balance = "+bal);
		System.out.println("*****Transaction Completed*****");
	}
	public void Withdraw(int money) {
		bal -= money;
		System.out.println("Balance = "+bal);
		System.out.println("*****Transaction Completed*****");
	}
	
}
public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Banking b = new Banking();
		System.out.println("Enter the password : ");
		int pwd = sc.nextInt();
		if(pwd == 2002) {
		System.out.println("Enter the service : \n1.Deposite \n2.Withdraw \n3.Balance Cheack");
		int ch = sc.nextInt();
		switch(ch) {
		case 1: System.out.println("Enter the amount : ");
		 		b.Deposite(sc.nextInt());
		 		break;
		case 2: System.out.println("Enter the amount : ");
 				b.Withdraw(sc.nextInt());
 				break;
		case 3: System.out.println("Your balance is : ");
				b.Balance();
				break;
		default:System.out.println("Invalid Input");
		}
		}else {
			System.out.println("Wrong Password");
		}
		sc.close();
	}

}
