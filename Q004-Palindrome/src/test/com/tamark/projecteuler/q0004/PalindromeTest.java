package test.com.tamark.projecteuler.q0004;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tamark.projecteuler.q0004.Palindrome;

public class PalindromeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCheckResult() {
		String result = "123456";
		assertFalse(Palindrome.checkResult(result));
		result = "123321";
		assertTrue(Palindrome.checkResult(result));
		result = "12321";
		assertTrue(Palindrome.checkResult(result));
		result = "12341";
		assertFalse(Palindrome.checkResult(result));
		result = "9";
		assertTrue(Palindrome.checkResult(result));
	}

	@Test
	public void testFindLargestPalindrome() {
		int palindrome = Palindrome.findLargestPalindrome(100);
		assertEquals(9009, palindrome);
	}
}
