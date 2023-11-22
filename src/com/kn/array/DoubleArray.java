package com.kn.array;

import java.util.Scanner;

public class DoubleArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
         System.out.println("enter the size of Double array=");
		int size = scan.nextInt();
		double[] arr;
		arr = new double[size];

		for (int i = 0; i < size; i++) {
          System.out.println("enter data for array element" + (i + 1)+"=");
		arr[i] = scan.nextDouble();
		}
		System.out.println("====>array initialization");
		//forward traversing
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) +  "element= ");
			System.out.println(arr[i]);
		}
		scan.close();

	}

}
