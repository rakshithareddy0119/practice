package com.kn.array;

import java.util.Scanner;

public class FindArrayInElement2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array =");
		int size= scan.nextInt();
		//array d&c
		int[] arr= new int[size];
		//initialization
		System.out.println("enter data for array element");
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter data for " +(i+1)+ "array element=");
			arr[i]= scan.nextInt();
		}
		System.out.println("enter elment to search=");
		int element= scan.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				System.out.println("element is found");
			}else {
				System.out.println("element not found");
			}
		}
		scan.close();
	}

}
