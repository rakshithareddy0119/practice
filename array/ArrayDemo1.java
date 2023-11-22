package com.kn.array;

public class ArrayDemo1 {

	public static void main(String[] args) {
		//array declaration
		int[] arr;
		//array creation
		arr= new int[5];
		
		System.out.println("array elements before initialization");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		//array initialization
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println("array elemts after initialization");
		//print array elements
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}

}
