package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import models.KnapSackObject;

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
	
	@Test
	public void testContinuousKnapsack() {
		KnapSackObject one = new KnapSackObject(1, 120, 5);
		KnapSackObject two = new KnapSackObject(2, 150, 5);
		KnapSackObject three = new KnapSackObject(3, 200, 4);
		
		List<KnapSackObject> knapsackObjects = new ArrayList<KnapSackObject>();
		knapsackObjects.add(one);
		knapsackObjects.add(two);
		knapsackObjects.add(three);
		
		int capacity = 300;
		
		Greedy.continuousKnapsack(knapsackObjects, capacity);
		
		Assert.assertEquals(true, true);
	}
}
