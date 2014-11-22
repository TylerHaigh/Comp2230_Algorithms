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
	
	@Test
	public void testDynamicCoinChange() {
		int[] denom = {10, 6, 1};
		int sum = 10;
		
		int[][] expecteds =	{
			  {0, 1, 2, 3, 4, 5, 1, 2, 3, 4, 1},
			  {0, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5},
			  {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10} };
		int [][] actuals = DynamicProgramming.dynamicCoinChange(denom, sum);
		
		//Print the partial sums
		System.out.print("\t");
		for (int k = 0; k < actuals[1].length; k++) {
			System.out.print("S=" + k + ",\t");
		}
		System.out.println();
		
		//Print the martix rows
		for (int i = 0; i < actuals.length; i++) {
			
			System.out.print(denom[i] + ":\t");
			for (int j = 0; j < actuals[i].length; j++) {
				System.out.print(actuals[i][j] + ",\t");
			}
			System.out.println();
			
			Assert.assertArrayEquals(expecteds[i], actuals[i]);
		}
	}
	
	@Test
	public void testmatrixMultiply() {
		int[] sizes = { 5,3,1,4,6 };
		
		int[][] expecteds = {
				{0, 0, 0, 0, 0},
				{0, 0, 15, 35, 69},
				{0, 0, 0, 12, 42},
				{0, 0, 0, 0, 24},
				{0, 0, 0, 0, 0}
			};
		
		int[][] actuals = DynamicProgramming.matrixMultiply(sizes);
		
		for (int i = 0; i < actuals.length; i++) {
			for (int j = 0; j < actuals[i].length; j++) {
				System.out.print(actuals[i][j] + ",\t");
			}
			System.out.println();
			
			Assert.assertArrayEquals(expecteds[i], actuals[i]);
		}
		
	}
}
