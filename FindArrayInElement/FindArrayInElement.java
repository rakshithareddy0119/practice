package com.kn.FindArrayInElement;

public class FindArrayInElement {

	public Boolean FindArrayInElementusing1D(int[] arr, int element) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				return true;
			}
	}
			return false;
		}
}
