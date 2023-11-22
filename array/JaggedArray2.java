package com.kn.array;

import java.util.Scanner;

public class JaggedArray2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//array declaration & creation
	int[][] arr= new int[4][];
	
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter size for " +(i+1)+ "array=");
			arr[i]=new int[sc.nextInt()];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter data for "+(i+1)+ "array element=");
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("enter data for" +(i+1)+ "array element=");
			arr[i][j]=sc.nextInt();
		}
	}
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+ "array element=");
		for(int j=0;j<arr[i].length;j++) {
			System.out.println((j+1)+ "array element="+arr[i][j]);
		}
		}
		sc.close();
	}
}
	