package com.kn.array;

public class ArrayDemo5 {

	public static void main(String[] args) {
		//array declaration
		int[] arr;
		//array creation
		arr= new int[5];
		//array initialization
		for(int i=0;i<arr.length;i++) {
//			arr[i]=10;
//			arr[i]=i+10;
			arr[i]=10*(i+1);
		
		}
		//print array elements
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
	}

}
