package test.com.tamark.projecteuler.q0002;

import static org.junit.Assert.*;
import org.junit.Test;

import com.tamark.projecteuler.q0002.SumEvenFibonacciNumbers;

public class SumEvenFibonacciNumbersTest {

	private static final int[] EXPECTED_NUMBERS = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 0};

	@Test
	public void sumEvenFibonacciNumbers() {
		int[] fibonacciNumbers = SumEvenFibonacciNumbers.determineFibonacciNumbers(100);
		assertArrayEquals(EXPECTED_NUMBERS, fibonacciNumbers);
		long sum = SumEvenFibonacciNumbers.sumEvenNumbers(fibonacciNumbers);
		assertEquals(44, sum);
	}

}
