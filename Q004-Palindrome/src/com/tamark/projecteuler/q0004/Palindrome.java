package com.tamark.projecteuler.q0004;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Palindrome {

	public static void main(String[] args) {

		int limit;
		if (args.length > 0) {
			limit = Integer.valueOf(args[0]);
		} else {
			limit = promptForLimit();
		}

		int palindrome = findLargestPalindrome(limit);
		System.out.println("Largest palindrome is: " + palindrome + ".");
	}

	public static int findLargestPalindrome(int limit) {
		Set<Integer> results = calculateFactors(limit);
		int palindrome = 0;
		for (Iterator iterator = results.iterator(); iterator.hasNext();) {
			Integer testValue = (Integer) iterator.next();
			if (checkResult(testValue.toString()) && testValue.intValue() > palindrome) {
				palindrome = testValue.intValue();
			}
		}
		return palindrome;
	}

	private static Set<Integer> calculateFactors(int limit) {
		boolean foundIt = false;
		int result = 0;
		Set<Integer> results = new TreeSet<Integer>();
		int limitSize = String.valueOf(limit).length();
		if (limitSize >= 2) {
			limitSize = limitSize - 2;
		} else {
			limitSize = 0;
		}
		int	startValue = (int) (limit / Math.pow(10, limitSize));
		for (int factor1 = startValue; factor1 < limit; factor1++) {
			for (int factor2 = startValue; factor2 < limit; factor2++) {
				results.add(factor1 * factor2);
			}
		}
		return results;
	}

	private static int promptForLimit() {

		Scanner scanner = new Scanner(System.in);

		int returnValue = 1000;
		System.out.print("Enter the upper limit to text through (exclusive): ");
		try {
			returnValue = scanner.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnValue;
	}

	public static boolean checkResult(String result) {

		for (int i = 0; i < result.length() / 2; i++) {
			String leftSide = result.substring(i, i + 1);
			int endPos = result.length() - i;
			String rightSide = result.substring(endPos - 1, endPos);
			if (leftSide.equals(rightSide) == false) {
				return false;
			}
		}
		return true;
	}
}
