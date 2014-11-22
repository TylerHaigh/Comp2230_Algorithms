package models;

public class KnapSackObject implements Comparable<KnapSackObject> {
	public int id;
	public int profit;
	public int weight;
	
	public KnapSackObject() {
		this.id = 0;
		this.profit = 0;
		this.weight = 0;
	}
	
	public KnapSackObject(int id, int profit, int weight) {
		this.id = id;this.profit = profit;
		this.weight = weight;
	}
	
	@Override
	public int compareTo(KnapSackObject other) {
		int thisRatio = this.profit / this.weight;
		int otherRatio = other.profit / other.weight;
		
		if (thisRatio > otherRatio) return 1;
		else if (thisRatio < otherRatio) return -1;
		else return 0;
		
	}
}