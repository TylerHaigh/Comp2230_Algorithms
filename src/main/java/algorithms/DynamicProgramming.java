package algorithms;

public class DynamicProgramming {

	public static int fibonacci_array(int n) {
		
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		//Setup
		int[] array = new int[n + 1];
		array[0] = 0;
		array[1] = 1;
		
		//Iterate
		for (int i = 2; i <= n; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		
		//Return result
		return array[n];
	}
	
	public static int fibonacci_simple(int n) {
		
		int last = 1;
		int secondLast = 0;
		
		for (int i = 2; i <= n; i++) {
			int _new = last + secondLast;
			secondLast = last;
			last = _new;
		}
		
		return last;
	}
	
	public static int exponential(int val, int exponent) {
		int result = 0;
		for (int i = 0; i < exponent; i++) {
			result += val * exponent;
		}
		return result;
	}
}
