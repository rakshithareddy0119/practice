package com.kn.array;

import java.util.Scanner;

public class SumOfTwoArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size1 of arr array=");
		int size1=sc.nextInt();
		
		//arr d & c
		int[] arr = new int[size1];
		//initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter data for" +(i+1)+ "arr array element");
			arr[i]=sc.nextInt();
		}
		System.out.println("enter size2 of arr array=");
		int size2=sc.nextInt();
		
		//arr d & c
		int[] brr = new int[size2];
		//initialization
		for(int j=0;j<arr.length;j++) {
			System.out.println("enter data for" +(j+1)+ "arr array element");
			brr[j]=sc.nextInt();
		}
		if(size1!=size2) {
			System.out.println("ivalid input.we cant add the elements");
		}else {
		int[] crr= new int[arr.length];
			for(int k=0;k<arr.length;k++) {
			crr[k]=arr[k]+brr[k];
		}
		
		
		System.out.println("after adding elements");
		System.out.print("[");
		for(int k=0;k<arr.length;k++) {
			if(k==0) {
				System.out.print(+crr[k]);
			}else {
				System.out.print(","+crr[k]);
			}
		}
		}
		System.out.println("]");
		sc.close();
			}

}
// arr= 1,2,3 brr= 3 ,2,1 crr= 4,4,4
