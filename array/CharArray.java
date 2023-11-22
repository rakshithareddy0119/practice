package com.kn.array;

import java.util.Scanner;

public class CharArray{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of character array=");
		int size = scan.nextInt();
		char[] arr;
		arr = new char[size];
		
		System.out.println("enter data for array elements");
		for (int i = 0; i < size; i++) {
			arr[i] = scan.next().charAt(0);
		}
		System.out.println("character array initialization");
//		System.out.println("data within array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		scan.close();

	}

}
