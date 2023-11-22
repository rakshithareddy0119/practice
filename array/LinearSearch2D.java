package com.kn.array;

import java.util.Scanner;

public class LinearSearch2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size1 of the array=");
		int size1= sc.nextInt();
		System.out.print("enter size2 of the array=");
		int size2= sc.nextInt();
		//creation & declaration
		int[][] arr= new int[size1][size2];
		//initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter data for" +(i+1)+ "array element=" );
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter data for" +(j+1)+ "array element=" );
				arr[i][j]=sc.nextInt();
		}
		
	}
	
		System.out.println("enter key to search=");
		int key = sc.nextInt();
		int locationI=-1;
		int locationJ=-1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if (key==arr[i][j]) {
					locationI=i;
					locationJ=j;
				}
			}
			if (locationI >= 0 && locationJ >= 0) {
	            System.out.println("Element " + key + " found at [" + locationI + "][" + locationJ + "]");
			}else {
				System.out.println("element not found");
			}
		}
			sc.close();
		
}
}
