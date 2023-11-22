package com.kn.array;
import java.util.Scanner;
public class SumOfArrayUsingJaggedArray {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("enter size of the array=");
	int size= scan.nextInt();
		
		//attay d&c
		int[][] arr = new int[size][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter size for" +(i+1)+ "array element=");
			arr[i]=new int [scan.nextInt()];
		}
		//initialization
		for(int i1=0;i1<arr.length;i1++) {
			System.out.println("enter data for" +(i1+1)+ "array element=");
			for(int j=0;j<arr[i1].length;j++) {
				System.out.println("enter data for" +(j+1)+ "array element=");
				arr[i1][j]=scan.nextInt();
				
		}
		
	}
		int sum=0;
		for(int i1=0;i1<arr.length;i1++) {
			for(int j=0;j<arr[i1].length;j++) {
				sum= sum+arr[i1][j];
			}
}
		System.out.println("sum of array="+sum);
				scan.close();
			}
			
		}

	


