package com.kn.array;

import java.util.Scanner;

public class SumOfMatrixArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//arr
		System.out.print("enter size1 of the  arr array");
		int size1= scan.nextInt();
		System.out.print("enter size2 of the  arr array");
		int size2= scan.nextInt();
		// arr d & c
		int[][] arr = new int[size1][size2];
		//initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter data for " +(i+1)+ "array element");
			for (int j=0;j<arr[i].length;j++) {
				System.out.print("enter data for " +(j+1)+ "array element=");
				arr[i][j]=scan.nextInt();
				//print
			}
		}
		//print
		for(int i=0;i<arr.length;i++) {
			System.out.println(+(i+1)+"array elemet");
			for (int j=0;j<arr[i].length;j++) {
				System.out.println(+(j+1)+"array elemet="+arr[i][j]);
			}
		}
		//brr
				System.out.print("enter size3 of the  brr array=");
				int size3= scan.nextInt();
				System.out.print("enter size4 of the  brr array=");
				int size4= scan.nextInt();
				// brr d & c
				int[][] brr = new int[size3][size4];
				//initialization
				for(int i=0;i<brr.length;i++) {
					System.out.println("enter data for " +(i+1)+ "array element=");
					for (int j=0;j<brr[i].length;j++) {
						System.out.print("enter data for " +(j+1)+ "array element=");
						brr[i][j]=scan.nextInt();
					}
				}
				//print
				for(int i=0;i<brr.length;i++) {
					System.out.println(+(i+1)+"array elemet");
					for (int j=0;j<brr[i].length;j++) {
						System.out.println(+(j+1)+"array elemet="+brr[i][j]);
					}
				}
				//crr d & c
				if(arr.length!=brr.length) {
					System.out.println("invalid input . we cant add sum of it");
				}else {
				int[][] crr= new int[arr.length][brr.length];
				//initialization
				for(int i=0;i<arr.length;i++) {
					for (int j=0;j<arr[i].length;j++) {
						crr[i][j]= arr[i][j]+brr[i][j];
					}
				}
				
				for(int i=0;i<crr.length;i++) {
					System.out.println((i+1)+ "array element");
					for (int j=0;j<crr[i].length;j++) {
						System.out.println((j+1)+ "array element="+crr[i][j]);
					}
				}
				}
				scan.close();
	}

}
