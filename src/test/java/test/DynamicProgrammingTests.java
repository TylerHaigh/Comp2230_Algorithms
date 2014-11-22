package test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import algorithms.DynamicProgramming;

public class DynamicProgrammingTests {

	@Test
	public void testFibonacci_array() {
		int n = 23;
		int expected = 28657;
		int actual = DynamicProgramming.fibonacci_array(n);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFibonacci_simple() {
		int n = 17;
		int expected = 1597;
		int actual = DynamicProgramming.fibonacci_simple(n);
		
		Assert.assertEquals(expected, actual);
	}
}
