package test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import algorithms.Recursive;

public class RecursiveTests {

	@Test
	public void testFibonacci() {
		int n = 5;
		int expected = 5;
		int actual = Recursive.fibonacci(n);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExponential_1() {
		int val = 2;
		int exponent = 5;
		int expected = 32;
		int actual = Recursive.exponential_1(val, exponent);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExponential_2_even() {
		int val = 2;
		int exponent = 5;
		int expected = 32;
		int actual = Recursive.exponential_2(val, exponent);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExponential_2_odd() {
		int val = 5;
		int exponent = 3;
		int expected = 125;
		int actual = Recursive.exponential_2(val, exponent);
		Assert.assertEquals(expected, actual);
	}
}
