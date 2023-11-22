package com.kn.array;

import java.util.Scanner;

public class ArrayDemo7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array=");
		int size = scan.nextInt();
		int[] arr;
		arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = 10 * (i + 1);
		}
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		scan.close();
	}

}
