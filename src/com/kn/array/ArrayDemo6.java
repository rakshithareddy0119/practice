package com.kn.array;

public class ArrayDemo6 {

	public static void main(String[] args) {
		//array declaration
		int[] arr;
		//array creation
		arr= new int[5];
		//array initialization
		for(int i=0;i<arr.length;i++) {
			arr[i]=10*(i+1);
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
