package algorithms;

public class DynamicProgramming {

	public static long fibonacci_array(int n) {
		
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		//Setup
		long[] array = new long[n + 1];
		array[0] = 0;
		array[1] = 1;
		
		//Iterate
		for (int i = 2; i <= n; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		
		//Return result
		return array[n];
	}
	
	public static long fibonacci_simple(int n) {
		
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		long oneBack = 1;
		long twoBack = 0;
		
		for (int i = 2; i <= n; i++) {
			long _new = oneBack + twoBack;
			twoBack = oneBack;
			oneBack = _new;
		}
		
		return oneBack;
	}
	
	public static long exponential(int val, int exponent) {
		long result = 0;
		for (int i = 0; i < exponent; i++) {
			result += val * exponent;
		}
		return result;
	}
	
	public static long memorisedFibonacci(int n) {
		long[] results = new long[n + 1];
		for (int i = 0; i < n + 1; i++) {
			results[i] = -1; //Undefined
		}
		
		return memorisedFibonacciRecursive(results, n);
	}
	
	private static long memorisedFibonacciRecursive(long[] results, int n) {
		if (results[n] != -1) return results[n];
		
		long val = (n == 1 || n == 2) ? 1 :
			memorisedFibonacciRecursive(results, n-2) + memorisedFibonacciRecursive(results, n-1);
		
		results[n] = val;
		return val;
	}
	
	public static int[][] dynamicCoinChange(int[] denom, int sum) {
		int n = denom.length;
		int[][] change = new int[n][sum + 1];
		
		//Fill in bottom row with smallest denomination
		for (int i = 0; i <= sum; i++) {
			change[n-1][i] = i;
		}
		
		//Loop back through denominations
		for (int i = n - 2; i >= 0; i--) {
			
			//Loop through 0 to sum
			for (int j = 0; j <= sum; j++) {
				//If denomination is less than partial sum
				//or can accommodate lower denomination and less change from this denomination 
				if (denom[i] > j || change[i+1][j] < 1 + change[i][j - denom[i]])
					change[i][j] = change[i+1][j];
				else
					change[i][j] = 1 + change[i][j - denom[i]];
			}
		}
		
		return change;
	}
	
	public static int[][] matrixMultiply(int[] arraySizes) {
		int[][] multiplied = new int[arraySizes.length][arraySizes.length];
		int n = arraySizes.length;
		
		//Put zeros along the diagonal
		for (int i = 0; i < n; i++) {
			multiplied[i][i] = 0;
		}
		
		for (int w = 0; w < n; w++) {
			for (int i = 0; i < n - w-1; i++) {
				int j = w + i + 1;
				multiplied[i][j] = Integer.MAX_VALUE;
				
				//Insert magic here
				for (int k = i; k < j; k++) {
					int q = multiplied[i][k] + multiplied [k+1][j] + ((i == 0) ? 0 : arraySizes[i-1]) *
							arraySizes[k] * arraySizes[j];
					
					if (q < multiplied[i][j])
						multiplied[i][j] = q;
				}
			}
		}
		
		return multiplied;
	}
}
