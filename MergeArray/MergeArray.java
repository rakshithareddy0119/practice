package com.kn.MergeArray;

public class MergeArray {


	public int[] mergearray(int[] arr, int[] brr) {
      int[] crr = new int[arr.length+brr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(i>=0 && i<arr.length) {
				crr[i]=arr[i];
			}	
			}
			for(int j=arr.length;j<brr.length;j++) {
				crr[j]=brr[j-arr.length];
			}
		return crr;
	}

}
