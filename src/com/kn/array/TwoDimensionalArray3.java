package com.kn.array;

import java.util.Scanner;

public class TwoDimensionalArray3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// array declaration and creation
		int[][] arr = new int[3][2];
		// array iniatialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "element  2D array ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("enter data for element" + (j + 1) + "=");
				arr[i][j] = scan.nextInt();

			}
		}
		System.out.println("==> 2D array initialization done");
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "element 2D array");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println((j+1)+ " element=" +(arr[i][j]));
			}
		}
		scan.close();
	}

}
