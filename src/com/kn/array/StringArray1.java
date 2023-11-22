package com.kn.array;

import java.util.Scanner;

public class StringArray1 {

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
		 int count=1;
		 for(String s: arr) {
			 System.out.println(count++ +"element="+ s);
			 
		}
		scan.close();

	}

}
