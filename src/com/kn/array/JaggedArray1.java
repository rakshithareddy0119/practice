package com.kn.array;

import java.util.Scanner;

public class JaggedArray1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the base size of jagged array=");
		int size = scan.nextInt();
		//jagged array declaration & creation
		int[][] arr= new int[size][];          // enter only base
		for(int i=0;i<arr.length;i++) {
			System.out.print("enter the size of  "+(i+1)+ " Array =");
				arr[i]=new int[scan.nextInt()];
		}
		// array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.print("enter data for"+(i+1)+ " jagged array=");
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("enter data for"+(j+1)+ "element of jagged array=");
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("===> jagged array initialization done");
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+ "element of jagged array");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println((j+1)+ "element of jagged array="+arr[i][j]);
			}
		}
		scan.close();
	}

}
