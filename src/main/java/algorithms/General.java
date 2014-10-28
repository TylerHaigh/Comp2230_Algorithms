
public class General {

	public static int TowersOfHanoi(int n) {
		if (n == 0) return 0;
		else {
			return 2 * TowersOfHanoi(n - 1) + 1;
		}
	}
}
