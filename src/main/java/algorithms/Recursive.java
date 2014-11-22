package algorithms;

public class Recursive {

	public static int fibonacci(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static int exponential_1(int val, int exponent) {
		if (exponent == 1) return val;
		
		int half = exponent / 2;
		return exponential_1(val, half) * exponential_1(val, exponent - half);
	}
	
	public static int exponential_2(int val, int exponent) {
		if (exponent == 1) return val;
		
		int half = exponent / 2;
		int power = exponential_2(val, half);
		power = power * power;
		
		if (exponent % 2 == 0) { //If val is even
			 return power;
		} else {
			return power * val;
		}
	}
	
}
