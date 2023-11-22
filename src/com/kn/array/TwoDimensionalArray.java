package com.kn.array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		//array declaration
		int[][]  arr;
		//array creation
		arr= new int[2][2];
		//array initialization
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=40;
		//print array elements
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		
	}

}
