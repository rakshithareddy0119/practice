package com.kn.array;

import java.util.Scanner;

public class FindhArrayInElement11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of the array=");
		int size=scan.nextInt();
		
		int[] arr= new int[size];
		
		System.out.println("enter data for the array");
		for(int i=0;i<arr.length;i++) {
			System.out.println("enetr data for"+(i+1)+ "array element=");
			arr[i]=scan.nextInt();
		}
		System.out.println("enetr element to search=");
		int element= scan.nextInt();
			System.out.print("[");
			for(int i=0;i<arr.length;i++) {
				if(i>0) {
					System.out.print("," +arr[i]);
				}else {
					System.out.print(arr[i]);
				}
		}
			System.out.print("]");
			
			
		int location=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				location=i;
			}
		}
		if(location>=0) {
			System.out.println("element found at locatiom=" +location);
		}else {
			System.out.println("element not found");
		}
	}

}
