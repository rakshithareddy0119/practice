package com.kn.array;

import java.util.Scanner;

public class FindElementsInArray2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//array declaration & creation
		int[] arr=new int[4];
		//array initialization
		System.out.println("enter data for element");
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter data for " +(i+1)+ "array element=");
			arr[i]=scan.nextInt();
		
		}
		System.out.println("enter the element to search=");
	  int element=scan.nextInt();
	  int location=-1;
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i]==element) {
			  location=i;
			  break;
		  } 
		  }
	    if(location>=0) {
	    	System.out.println("element found at location="+location);
	    }else {
	    	System.out.println("element not found");
	    }
	    scan.close();
	}

}

