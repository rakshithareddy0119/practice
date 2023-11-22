package com.kn.array;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {48,32,64,9,17,96,5};
		System.out.println("elements before sorting");
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("]");
		
		for(int i=0;i<arr.length;i++) {	
			int min=arr[i];
			int index =i;
		
			for(int j=(i+1);j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					index=j;
				}
		}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
	
	System.out.println("elements after sorting");
	System.out.print("[");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+ " ");
	}
	System.out.print("]");
}
}