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
}
