package com.kn.array;

import java.util.Scanner;

public class PushTheArrayElements {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size= sc.nextInt();
		int [] arr= new int[size];
		
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++) {
			System.err.println("enter data for" +(i+1)+"array element");
			arr[i]=sc.nextInt();
		}
		System.out.println("array elements before pushing");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+ "array element="+arr[i]);
		}
		
		int end=arr[0];
		int[] brr=new int[arr.length];
		for(int i=0;i<arr.length-1;i++) 
		{
			brr[i]=arr[i+1];
		}
		brr[arr.length-1]=end;
		System.out.println();
		
		System.out.println("array elements after pushing");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+ "array element="+brr[i]);
		}
		sc.close();
	}
	

}
