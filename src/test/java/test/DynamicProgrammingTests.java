package test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import algorithms.DynamicProgramming;

public class DynamicProgrammingTests {

	@Test
	public void testFibonacci_array() {
		int n = 23;
		long expected = 28657;
		long actual = DynamicProgramming.fibonacci_array(n);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFibonacci_simple() {
		int n = 17;
		long expected = 1597;
		long actual = DynamicProgramming.fibonacci_simple(n);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExponential() {
		int val = 3;
		int exponent = 3;
		long expected = 27;
		long actual = DynamicProgramming.exponential(val, exponent);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testMemorisedFibonacci() {
		int n = 43;
		long expected = 433494437;
		long actual = DynamicProgramming.fibonacci_simple(n);
		
		Assert.assertEquals(expected, actual);
	}
}
