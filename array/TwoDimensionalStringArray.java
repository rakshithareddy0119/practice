package com.kn.array;

import java.util.Scanner;

public class TwoDimensionalStringArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//array decalration & creation
		String[][] arr= new String[2][3];
		//array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println( (i+1)+ "element string 2D array");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter data for " +(j+1)+ "string 2D array=");
				arr[i][j]=scan.next();
			}
		}
		System.out.println("===> 2D string array initialization done");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println( (i+1)+" element string 2D array");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println((j+1)+" element 2D string array=" +arr[i][j]);
			}
		}
		scan.close();
	}

}
