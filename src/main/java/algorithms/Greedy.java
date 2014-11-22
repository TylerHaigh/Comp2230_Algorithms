package algorithms;

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
}
