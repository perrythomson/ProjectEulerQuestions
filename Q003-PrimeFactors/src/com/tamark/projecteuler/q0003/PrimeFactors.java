package com.tamark.projecteuler.q0003;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class PrimeFactors {

	public static void main(String[] args) {
		System.out.println("Starting process ...");
		Calendar start = new GregorianCalendar();

		long numberToFactor = Long.valueOf(args[0]);
		List<Long> factors = determinePrimeFactors(numberToFactor);
		System.out.println("The largest prime factor of " + numberToFactor + " is: " + factors.get(factors.size()-1));

		Calendar end = new GregorianCalendar();
		System.out.println("Time to factor " + numberToFactor + " was:" + (end.getTimeInMillis() - start.getTimeInMillis()) + " ms");

	}

	public static List<Long> determinePrimeFactors(long numberToFactor) {
		List<Long> resultList = new ArrayList<>();
		resultList.add(new Long(1));
		long largestPossibleFactor = numberToFactor/2;
		long currentTestValue = numberToFactor;
		for (int i = 2; i <= largestPossibleFactor && i <= currentTestValue; i++) {
			boolean tryAgain = true;
			do {
				if (currentTestValue % i == ((double)currentTestValue) / i || currentTestValue % i == 0) {
					resultList.add(new Long(i));
					currentTestValue = currentTestValue / i;
				} else {
					tryAgain = false;
				}
			} while (tryAgain);
		}
		if (resultList.size() == 1) {
			resultList.add(new Long(numberToFactor));
		}
		return resultList;
	}

}
