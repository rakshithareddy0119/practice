package com.kn.array;

import java.util.Scanner;

public class MatrixMultiplicationOfTwoArray {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the number of rows of arr matrix=");
	int row=scan.nextInt();
	System.out.println("enter the number of columns of arr matrix=");
	int column=scan.nextInt();
//		arr d & c
	int[][] arr= new int[row][column];
	//initialization
	for(int i=0;i<row;i++) {  //row
	System.out.println("enter data for " +(i+1)+"row element=");
	for(int j=0;j<column;j++) {  //column
		System.out.print("enter data for " +(j+1)+"column element=");
		arr[i][j]=scan.nextInt();
	}
}
	
		//brr
System.out.println("enter the number of rows of brr matrix=");
int row1=scan.nextInt();
System.out.println("enter the number of columns of brr matrix=");
int column1=scan.nextInt();
//				brr d & c
int[][] brr= new int[row1][column1];
//initialization
for(int i=0;i<row1;i++) {  //row
	System.out.println("enter data for " +(i+1)+"row element=");
	for(int j=0;j<column1;j++) {  //column
		System.out.println("enter data for " +(j+1)+"column element=");
		brr[i][j]=scan.nextInt();
	}
}
if(row!=column1) {
	System.out.println("invalid input. number of rows of arr matrix is not equal to number of columns of brr matrix .we can't multiply");
}

 //crr d&c
 int[][] crr= new int[row][column1];
//initialization
for(int i=0;i<row;i++) {
	for(int j=0;j<column1;j++) {
		crr[i][j]=0;
		for(int k=0;k<column;k++) {
	crr[i][j]= crr[i][j] +(arr[i][j]*brr[i][j]);
	}
}
	System.out.println("result of crr matrix");
 for(int i1=0;i1<row;i1++) {
	 for(int j=0;j<column1;j++) {
		 System.out.println(crr[i1][j]+ " ");
	 }
 }
}
 scan.close();
	}
}

