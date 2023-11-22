package com.kn.array;

import java.util.Scanner;

public class FindPositionInArrayElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array=");
		int size= sc.nextInt();
		
		int[] arr= new int [size];
		System.out.println("==> enetr data for array element<==");
	
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter data for"+(i+1)+ "array element="); 
			arr[i]=sc.nextInt();
		}
		System.out.println("enter element to search=");
		int element= sc.nextInt();
		
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if(i>0) {
				System.out.print("," +arr[i]);
			}else {
				System.out.print(arr[i]);
			}
		}
			System.out.print("]");
		
		int position=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				position=(i+1);
			}
		}
		
		if(position>=1) {
			System.out.println( (element) +  "element found at position="+position);
		}else {
			System.out.println("element not found");
		}
		sc.close();
	}

	}

