package com.kn.array;

import java.util.Scanner;

public class PushTheElementsInArray3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
			int start1= arr[arr.length-2];
			int start2= arr[arr.length-1];
			int[] brr=new int[arr.length];
			
			brr[0]=start1;
			brr[1]=start2;
			for(int i=0;i<arr.length-2;i++)
			{
			     brr[i+2]=arr[i];
		}
			System.out.println("array elements after pushing");
			for(int j=0;j<arr.length;j++) {
				System.out.println((j+1)+ "array element="+brr[j]);
			}
					sc.close();
				}
				
	}

	


