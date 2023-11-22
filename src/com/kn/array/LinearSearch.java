package com.kn.array;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {10,23,45,89,48,94};
		int key = 23;
		int location=-1;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				location=i;
			}
		}
		if(location>=0) {
			System.out.println("element"  +key+  "found at" +(location+1));
				
			}else {
				System.out.println("element not found");
				
		}
		
	}

}
