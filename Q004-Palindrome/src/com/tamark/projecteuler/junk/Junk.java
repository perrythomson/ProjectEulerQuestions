package com.tamark.projecteuler.junk;

import java.util.Scanner;

import org.hamcrest.StringDescription;

public class Junk {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int diagonalOne = 0;
        int diagonalTwo = 0;
        for(int i = 0; i < n; i++) {
        	diagonalOne += a[i][i];
        	diagonalTwo += a[i][n-1-i];
        }
        System.out.println(Math.abs(diagonalTwo-diagonalOne));
    }

	private static int sumDiagonal(int[][] array, int index1, int index2) {
		int result = 0;
		for(i = 0; i < array[0].length; i++) {
			result += array[i][i];
		}
		// TODO Auto-generated method stub
		return 0;
	}


}
