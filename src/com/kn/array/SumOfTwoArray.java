package com.kn.array;

import java.util.Scanner;

public class SumOfTwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size  of arr array =");
		int sizearr= sc.nextInt();
		int[] arr= new int[sizearr];
		System.out.println("==>enter data for arr array element<==");
		for(int i=0;i<arr.length;i++) {
			System.out.print("enter data for " +(i+1)+ " arr array element=");
			arr[i]= sc.nextInt();
	}
		System.out.println("enter the size of brr  array =");
		int sizebrr= sc.nextInt();
		int[] brr= new int[sizebrr];
		System.out.print("==>enter data for brr array element<==");
		for(int j=0;j<arr.length;j++) {
			System.out.print("enter data for " +(j+1)+ " brr array element=");
			brr[j]= sc.nextInt();
		}
		
		//print arr 
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if(i>0) {
				System.out.print("," +arr[i]);
			}else {
				System.out.print(+arr[i]);
			}
		}
			System.out.println("]");
		
		//print brr
		System.out.print("[");
		for(int j=0;j<brr.length;j++) {
			if(j>0) {
				System.out.print("," +brr[j]);
			}else {
				System.out.print(+brr[j]);
			}
		}
			System.out.println("]");	
		
			if(arr.length !=brr.length) {
				System.out.println("invalid array input,can't find sum of it");
				//System.exit(0);
			}else {
				int[] crr= new int[arr.length];
				for(int k=0;k<arr.length;k++) {
					crr[k]=arr[k]+brr[k];
				}	
			
		//print crr
				System.out.print("[");
				for(int k=0;k<crr.length;k++) {
					if(k>0) {
						System.out.print("," +crr[k]);
					}else {
						System.out.print(+crr[k]);
					}		
				}
				System.out.println("]");	
			}
	       sc.close();
	}
}
		
