package com.kn.array;

import java.util.Scanner;

public class SumOfArrayUsing2D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size1 of the array=");
		int size1= scan.nextInt();
		System.out.println("enter size2 of the array=");
		int size2= scan.nextInt();
		//attay d&c
		int[][] arr = new int[size1][size2];
		//initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter data for" +(i+1)+ "array element=");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter data for" +(j+1)+ "array element=");
				arr[i][j]=scan.nextInt();
				
		}
		
	}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum= sum+arr[i][j];
			}
}
		System.out.println("sum of array="+sum);
		scan.close();
	}
	
}
