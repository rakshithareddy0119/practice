package com.kn.array;

import java.util.Scanner;

public class CharArray1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
System.out.println("enter the size of character array=");
		int size = scan.nextInt();
		char[] arr;
		arr = new char[size];

		for (int i = 0; i < size; i++) {
System.out.println("enter data for array element" + (i + 1)+"=");
		arr[i] = scan.next().charAt(0);
		}
		System.out.println("character array initialization");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+ "element= ");
			System.out.println(arr[i]);
		}
		scan.close();

	}

}
