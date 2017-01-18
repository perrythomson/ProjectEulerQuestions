package test.com.tamark.projecteuler.q0001;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

import com.tamark.projecteuler.q0001.MultiplesOf3and5;

public class MultiplesOf3and5Test {

	@Test
	public void testCalculateSumOfMultiples() {
		long result = MultiplesOf3and5.calculateSumOfMultiples(3, 5, 10);
		assertTrue("Result of calculateSumOfMultiples(3, 5, 10) is 23", result == 23);
		result = MultiplesOf3and5.calculateSumOfMultiples(3, 5, 30);
		//if calculateSumOfMultiples(3, 5, 20) returns 210, you did not eliminate common multiples!
		assertTrue("Result of calculateSumOfMultiples(3, 5, 30) is 195", result == 195);
	}

	@Test
	public void testAggregateMultiples() {
		Set<Integer> multiples = MultiplesOf3and5.aggregateMultiples(3, 10);
		assertTrue("Size of returned set is 3", multiples.size() == 3);
		int answer = sumMultiples(multiples);
		assertTrue("Sum of returned set is 18", answer == 18);
		multiples = MultiplesOf3and5.aggregateMultiples(5, 25);
		assertTrue("Size of returned set is 4", multiples.size() == 4);
		answer = sumMultiples(multiples);
		assertTrue("Sum of returned set is 50", answer == 50);
	}

	private int sumMultiples(Set<Integer> multiples) {
		int answer = 0;
		for (Iterator<Integer> iterator = multiples.iterator(); iterator.hasNext();) {
			Integer value = (Integer) iterator.next();
			answer += value;
		}
		return answer;
	}

}
