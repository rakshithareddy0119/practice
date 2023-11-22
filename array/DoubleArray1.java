package com.kn.array;

import java.util.Scanner;

public class DoubleArray1 {

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
		//backward traversing
		for (int i =arr.length-1;i>=0; i--) {
			System.out.print((i+1) +  "element= ");
			System.out.println(arr[i]);
		}
		scan.close();

	}

}
