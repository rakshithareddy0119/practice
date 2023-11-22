package com.kn.array;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
         System.out.println("enter the size of String array=");
		int size = scan.nextInt();
		String[] arr;
		arr = new String[size];

		for (int i = 0; i < size; i++) {
          System.out.println("enter data for array element" + (i + 1)+"=");
		arr[i] = scan.next();
		}
		System.out.println("====>array initialization");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) +  "element= ");
			System.out.println(arr[i]);
		}
		scan.close();

	}

}
