package com.kn.array;

import java.util.Scanner;

public class FindElementInArray1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array=");
		int size = scan.nextInt();
		// array decalaration & creation
		int[] arr = new int[size];

		// array initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter data for"+(i+1)+" array element");
			arr[i] = scan.nextInt();
		}
		System.out.print("Enter the element to search = ");
		int ele = scan.nextInt();
		int loc=-1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				 loc=i; 
			
			}
		}
		if(loc>=0) {
			System.out.println("Element found at location = "+loc);
		}else {
			System.out.println("Element not found");
		}
	
		scan.close();
	}

}


