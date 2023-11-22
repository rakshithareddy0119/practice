package com.kn.MergeArray;

import java.util.Scanner;

public class MergeArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size1 of arr array=");
		int size1=scan.nextInt();
		//arr d&c
		int[] arr= new int[size1];
		//initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter data for " +(i+1)+ "arr array element=");
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the size2 of brr array");
		int size2=scan.nextInt();
		//brr d&c
		int[] brr= new int[size2];
		//initialization
		for(int j=0;j<brr.length;j++) {
			System.out.println("enter data for " +(j+1)+ "brr array element=");
			brr[j]=scan.nextInt();
		}
		
		 MergeArray ma =new MergeArray();
		int crr[] =ma.mergearray(arr,brr);
		 
		 System.out.println("after merging");
		 System.out.print("[");
		 for(int k=0;k<crr.length;k++) {
			 if(k>0) {
				 System.out.print("," +crr[k]);
			 }
			 else {
				 System.out.print(+crr[k]);
		
			}
		}
		 System.out.println("]");
		 scan.close();
	}

}
