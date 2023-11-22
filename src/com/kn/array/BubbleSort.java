package com.kn.array;

public class BubbleSort {

	public static void main(String[] args) {
		//array creation & declaration
		int[] arr = {16,14,5,6,8};
		System.out.println("elements before sorting");
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("]");
		
		for(int i=0;i<arr.length-1;i++) {
			boolean isswapped=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					 isswapped=true;
				}
			}
			
		if( isswapped==false) {
			System.out.println("no further swapping required");
			break;
		}
			
		}
		System.out.println("elements after sorting");
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.print("]");
	}

}
