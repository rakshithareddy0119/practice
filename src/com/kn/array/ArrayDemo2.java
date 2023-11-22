package com.kn.array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// array declaration
		int[] arr;
		// array creation
		arr = new int[5];
		// array initialization
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		// print array elements
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
		// we want only 2 & 3
		System.out.println(arr[2]);
		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		// after 0-4 will be printed if we print after initialization of elements we get
		// index 5 out of bounds (exception error)
		System.out.println(arr[5]);
		
	}

}
