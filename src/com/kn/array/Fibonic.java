package com.kn.array;

import java.util.Scanner;

public class Fibonic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number for fibonic series=");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println(fibonic(i)+ "");
		}
		sc.close();
	}
	public static int fibonic(int n) {
		if(n==0 || n==1) {
			return n;
		}else {
			return fibonic(n-1)+fibonic(n-2);
		}
	}

}
