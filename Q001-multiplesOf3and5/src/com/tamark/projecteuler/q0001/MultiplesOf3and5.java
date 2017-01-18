package com.tamark.projecteuler.q0001;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

public class MultiplesOf3and5 {
	
//	private static Logger logger = 

	public static void main(String[] args) {
		long sum = calculateSumOfMultiples(3, 5, 30);
//		logger.log("The sum of the multiples of {} and {} below {} is: {}", 3, 5, 10000, sum);
		System.out.println("The sum of the multiples of 3 and 5 below 1000 is: " + sum);
	}

	public static long calculateSumOfMultiples(int factor1, int factor2, int limit) {
		Set<Integer> multiples = aggregateMultiples(factor1, limit);
		multiples.addAll(aggregateMultiples(factor2, limit));
		long answer = 0;
		for (Iterator<Integer> iterator = multiples.iterator(); iterator.hasNext();) {
			Integer value = (Integer) iterator.next();
			answer += value;
		}
		return answer;
	}

	public static Set<Integer> aggregateMultiples(int i, int j) {
		TreeSet<Integer> result = new TreeSet<Integer>();
		for (int j2 = 1; j2 < j; j2++) {
			float division = (float)j2/i;
			int truncated = j2/i;
			if (division == truncated) {
				result.add(new Integer(j2));
			}
		}
		System.out.println("List of multiples for " + i + ": ");
		for (Iterator<Integer> iterator = result.iterator(); iterator.hasNext();) {
			Integer value = (Integer) iterator.next();
			System.out.print(value.intValue() + ", ");
		}
		System.out.println("");
		return result;
	}

}
