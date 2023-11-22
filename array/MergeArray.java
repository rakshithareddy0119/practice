package com.kn.array;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size1 of arr array");
		int size1= scan.nextInt();
		
		//arr d& c
		int[] arr= new int[size1];
				//initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter data for "+(i+1)+ "array element");
			arr[i]=scan.nextInt();
		}
		//brr
		System.out.println("enter size2 of brr array");
		int size2= scan.nextInt();
		//brr d&c
		int[] brr= new int [size2];
		//initialization
		for(int j=0;j<brr.length;j++) {
			System.out.println("enter data for" +(j+1)+ "array element");
			brr[j]= scan.nextInt();
		}
		//crr
		int [] crr = new int[arr.length+brr.length];
		for(int i=0;i<arr.length;i++) {
			if(i>=0 && i<arr.length) {
			 crr[i]=arr[i];
			}
		}
		for(int j=arr.length;j<crr.length;j++) {
			crr[j]=brr[j-arr.length];
		}
		//print
		System.out.println("after merging");
		System.out.print("[");
		for(int k=0;k<crr.length;k++) {
			if(k>0) {
				System.out.print(","+crr[k]);
			}
			else {
				System.out.print(crr[k]);
			}
		}
		System.out.println("]");
		scan.close();
		}
}