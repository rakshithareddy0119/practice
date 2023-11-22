package com.kn.FindArrayInElement;

import java.util.Scanner;

public class FindArrayInElementDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of the array=");
		int size=scan.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter data for " +(i+1)+ "array element=");
			arr[i]=scan.nextInt();
		}
		System.out.println("enter element to search=");
		int element= scan.nextInt();
		
		FindArrayInElement f = new FindArrayInElement();
		Boolean found =f.FindArrayInElementusing1D(arr,element);
		
		if(found) {
			System.out.println("element found ");
		}else {
			System.out.println("element not found");
		}
		
		
		
	}
	

}
