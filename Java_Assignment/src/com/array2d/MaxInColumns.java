package com.array2d;
/*
 * 4.	WAP to print mimaxum in columns. Means
 *  e.g. arr[][]={{22, 31, 9}, {12, 5, 		16}, {34, 42, 2}} output is: 12, 5, 2.
 */
public class MaxInColumns {
    private int[][] array;

    public MaxInColumns(int[][] inputArray) {
        array = inputArray;
    }

    public void findAndPrintMinInEachColumn() {
        int numColumns = array[0].length;
        
        for (int j = 0; j < numColumns; j++) {
            int max = array[0][j];
            for (int i = 1; i < array.length; i++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            System.out.println("Minimum in column " + (j + 1) + ": " + max);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{22, 31, 9}, {12, 5, 16}, {34, 42, 2}};
        MaxInColumns MaxInColumns = new MaxInColumns(arr);
        MaxInColumns.findAndPrintMinInEachColumn();
    }
}