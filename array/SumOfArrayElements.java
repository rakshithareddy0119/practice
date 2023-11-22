package com.kn.array;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array=");
		int size=scan.nextInt();
		
		//array declaration & cration
		int[] arr= new int[size];
		//array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter data for array element=");
			arr[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		System.out.println("sum of array elements="+sum);
	}
		scan.close();
	}
}
