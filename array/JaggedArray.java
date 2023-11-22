package com.kn.array;

public class JaggedArray {

	public static void main(String[] args) {
		//jagged array decalaration and creation
		int[][] arr=new int[4][3];
		//jagged array initialization
		arr[0]= new int[2];
		arr[1]= new int[3];
		arr[2]= new int[4];
		arr[3]= new int[2];
		
		System.out.println("arr[0] length="+arr[0].length);
		System.out.println("arr[1] length="+arr[1].length);
		System.out.println("arr[2] length="+arr[2].length);
		System.out.println("arr[3] length="+arr[3].length);
		
	}

}
