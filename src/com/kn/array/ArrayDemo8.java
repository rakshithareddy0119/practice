package com.kn.array;

import java.util.Scanner;

public class ArrayDemo8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array=");
		int size = scan.nextInt();
		int[] arr;
		arr = new int[size];
		
		System.out.println("enter data for array elements");
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("data within array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		scan.close();

	}

}
