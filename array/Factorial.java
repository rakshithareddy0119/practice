package com.kn.array;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("enter a number to find it's factorial=");
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		System.out.println("factorial of" +n+ "=" +factorial(n));
	}
		private static long factorial(long n) {
			if(n==1) {
				return 1;
			}else {
			return	n*factorial(n-1);
			}
		
		}
}
