package com.kn.array;

import java.util.Scanner;

public class TwoDimensionalArray2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array=");
		int size=scan.nextInt();
		System.out.println("enter the length of array");
		int length= scan.nextInt();
		// array declaration and creation
		int[][] arr= new int[size][length];
		System.out.println("enter data for array elements");
		//array iniatialization
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=scan.nextInt();
				
			}
		}
		System.out.println("==> 2D array initialization done");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		scan.close();
	}

}
