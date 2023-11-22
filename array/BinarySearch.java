package com.kn.array;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {10,23,45,89,48,94};
		int key=23;
		
		int start=0,end=arr.length-1,mid;
		while(start<=end) {
			mid=(start+end)/2;
			if(arr[mid]==key) {
			System.out.println(key+ "found at position" +(mid+1));
			break;
			}else if(arr[mid]>key) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		if (start > end) {
            System.out.println(key + " not found in the array.");
	}
		
}
}
