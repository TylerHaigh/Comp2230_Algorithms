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
}
