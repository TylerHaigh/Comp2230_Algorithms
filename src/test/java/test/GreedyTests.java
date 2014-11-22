package test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import algorithms.Greedy;
import algorithms.UnfeasibleSolutionException;

public class GreedyTests {

	@Test
	public void testCoinChange() {
		int[] denom = {200, 100, 50, 20, 10, 5, 2, 1};
		int sum = 105;
		
		int[] expecteds = { 0, 1, 0, 0, 0, 1, 0, 0 };
		int [] actuals = Greedy.coinChange(denom, sum);
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testCoinChange_notOptimal() {
		int[] denom = {10, 6, 1};
		int sum = 22;
		
		int[] expecteds = { 2, 0, 2 };
		int [] actuals = Greedy.coinChange(denom, sum);
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testCoinChange_notFeasible() {
		int[] denom = {5, 4, 3};
		int sum = 6;
		
		try {
			Greedy.coinChange(denom, sum);
			fail("Solution was feasible");
		} catch (UnfeasibleSolutionException ex) {
			//pass();
		}
	}
}
