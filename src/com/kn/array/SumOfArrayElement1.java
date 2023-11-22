//package com.kn.array;
//
//import java.util.Scanner;
//
//public class SumOfArrayElement1 {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter the size of element=");
//		int size =scan.nextInt();
//		System.out.println("enter the length of element=");
//		int length=scan.nextInt();
//		System.out.println("enter the length1 of element=");
//		int length1=scan.nextInt();
//		//array declaration & creation
//		int[][][] arr=new int[size][length][length1];
//		//array initialization
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("enter data for "+(i+1)+ "array element i=");
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.println("enter data for " +(j+1)+ "array element j=");
//				for(int k=0;k<arr[i][j].length;k++) {
//					System.out.println("enter data for " +(k+1)+ "array element k=");
//					arr[i][j][k]=scan.nextInt();
//				}
//			}
//		}
//		 int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				for(int k=0;k<arr[i][j].length;k++)	{
//					sum=sum+arr[i][j][k];	
//				}
//			}
//		}
//		
//		System.out.println("sum of array="+sum);
//		scan.close();
//	}
//}
package com.kn.array;

import java.util.Scanner;

public class SumOfArrayElement1{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=>Enter size of 3 dimensional Array<=");
		System.out.print("Enter size for Array 1 = ");
		int s1 = sc.nextInt();
		System.out.print("Enter size for Array 2 = ");
		int s2 = sc.nextInt();
		System.out.print("Enter size for Array 3 = ");
		int s3 = sc.nextInt();
		int[][][] arr = new int[s1][s2][s3];
		System.out.println("=>Enter array elements for 3D Array Elements<=");
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + " array");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println((j + 1) + " array");
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("Enter element for " + (k + 1) + " array Element");
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					sum = sum + arr[i][j][k];
				}
			}
		}
		System.out.println("=>Sum of Array Elements = "+sum+" <=");
		sc.close();

	}

}