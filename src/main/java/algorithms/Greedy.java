package algorithms;

import java.util.Arrays;
import java.util.List;

import models.KnapSackObject;
import datastructures.Graph;

public class Greedy {

	public static int[] coinChange(int[] denom, int sum) throws UnfeasibleSolutionException {
		int[] coinsUsed = new int[denom.length];
		
		int i = 0;
		while (sum > 0 && i < denom.length) {
			int coins = sum / denom[i];
			coinsUsed[i] = coins;
			sum -= coins * denom[i];
			i++;
		}
		
		if (sum > 0) throw new UnfeasibleSolutionException();
		
		return coinsUsed;
	}
	
	public static void continuousKnapsack(List<KnapSackObject> array, int capacity) {
		
		array = Sort.mergeSort(array);
		
		int totalWeight = 0;
		int i = 0;
		
		while (i < array.size() && totalWeight < capacity) {
			KnapSackObject obj = array.get(i);
			
			if (totalWeight + obj.weight <= capacity) {
				System.out.println("selecting all of object " + obj.id);
				totalWeight += obj.weight;
			}
			else {
				int used = (capacity - totalWeight) / obj.weight;
				System.out.println("selecting " + used + " of object " + obj.id);
				totalWeight = capacity;
			}
			
			i++;
		}
		
		return ;
	}
}
