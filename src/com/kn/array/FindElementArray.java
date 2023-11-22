package com.kn.array;

import java.util.Scanner;

public class FindElementArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number in array");
		int number=scan.nextInt();
		//array declaration 
		int[] arr;
		//array creation
		arr= new int[5];
		//array initialization
		arr[0]= 73;
		arr[1]= 32;
		arr[2]= 49;
		arr[3]= 61;
		arr[4]= 90;
		 
		if(arr[0]== number) {
			System.out.println("true");
		} 
		else if(arr[1]== number) {
			System.out.println("true");
		}
		 
		if(arr[2]== number) {
			System.out.println("true");
		}
		 
		if(arr[3]==number ) {
			System.out.println("true");
		}
		if(arr[4]==number ) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
			
		scan.close();
	}

}


