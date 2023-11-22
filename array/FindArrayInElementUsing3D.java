package com.kn.array;

import java.util.Scanner;

public class FindArrayInElementUsing3D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size s1 for the array=");
		int s1= scan.nextInt();
		System.out.println("enter size s2 for the array=");
		int s2= scan.nextInt();
		System.out.println("enter size s3 for the array=");
		int s3= scan.nextInt();
		//array d&& c
		int[][][] arr= new int[s1][s2][s3];
		//initialization
		System.out.println("==> enter data for array element<==");
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter data for " +(i+1)+"array element");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter data for " +(j+1)+"array element");
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter data for " +(k+1)+"array element");
					arr[i][j][k]=scan.nextInt();
		}
	}
	}
		System.out.println("enter element to search=");
		int element=scan.nextInt();
		int location=-1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					if(arr[i][j][k]==element) {
						location=k;
						break;
					}
				}
			}
		}
		if(location>=0) {
			System.out.println("element found at location=" +location);
		}else {
			System.out.println("element not found");
		}
		scan.close();
	}
}
