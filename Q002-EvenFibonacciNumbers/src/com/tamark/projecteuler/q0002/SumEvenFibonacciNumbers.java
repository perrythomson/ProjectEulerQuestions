package com.tamark.projecteuler.q0002;

import java.util.ArrayList;
import java.util.List;

public class SumEvenFibonacciNumbers {

	public static void main(String[] args) {
		int upperLimit = Integer.valueOf(args[0]);
		int[] fibonacciSequence = determineFibonacciNumbers(upperLimit);
		long sum = sumEvenNumbers(fibonacciSequence);
		System.out.println("Sum = " + sum);
	}

	public static long sumEvenNumbers(int[] fibonacciSequence) {
		long result = 0;
		for (int i = 0; i < fibonacciSequence.length; i++) {
			if (fibonacciSequence[i] % 2 == 0) {
				result += fibonacciSequence[i];
			}
		}
		return result;
	}

	public static int[] determineFibonacciNumbers(int upperLimit) {
		Double size = (Math.log(upperLimit) + 1) * 2;
		int[] resultList = new int[size.intValue()];
		resultList[0] = 1;
		resultList[1] = 2;
		int nextValue = 0;
		for (int i = 2; i < resultList.length; i++) {
			nextValue = resultList[i - 2] + resultList[i - 1];
			if (nextValue < upperLimit) {
				resultList[i] = nextValue;
			}
		}
		return resultList;
	}

}
