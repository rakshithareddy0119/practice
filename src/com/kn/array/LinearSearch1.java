package com.kn.array;

public class LinearSearch1 {

    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30}, {11, 22, 33}, {1, 2, 3}};
        int key = 30;
        int locationI = -1; 
        int locationJ = -1; 

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    locationI = i;
                    locationJ = j;
                    break; // Exit the loop as soon as the key is found.
                }
            }
        }

        if (locationI >= 0 && locationJ >= 0) {
            System.out.println("Element " +key+ "found at i" +locationI+ ", j" +locationJ);
        } else {
            System.out.println("Element not found");
        }
    }
}
