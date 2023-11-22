package com.kn.array;

import java.util.Scanner;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//array decalration & creation
		int[][][] arr= new int[2][3][4];
		//array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println( (i+1)+ "element 3D array");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter data for " +(j+1)+ " element 3D array=");
				for(int k =0;k<arr[i][j].length;k++) {
					System.out.println("enter data for " +(k+1)+ " element 3D array=");
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("===> 3D  array initialization done");
		
				for(int i=0;i<arr.length;i++) {
					System.out.println( (i+1)+ "element 3D array");
					for(int j=0;j<arr[i].length;j++) {
						System.out.println( (j+1)+ " element 3D array");
						for(int k =0;k<arr[i][j].length;k++) {
							System.out.println((k+1)+ " element 3D array=" +arr[i][j][k]);
						}
			}
		}
		scan.close();
	}

}
