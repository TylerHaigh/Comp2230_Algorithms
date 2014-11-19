package algorithms;

import java.util.ArrayList;

public class General {

	public static int TowersOfHanoi(int n) {
		if (n == 0) return 0;
		else {
			return 2 * TowersOfHanoi(n - 1) + 1;
		}
	}
	
	public static <T extends Comparable<T>> T smallest(T a, T b, T c) {
		T smallest = a;
		if (b.compareTo(smallest) == -1) smallest = b;
		if (c.compareTo(smallest) == -1) smallest = c;
		
		return smallest;
	}
	
	public static <T extends Comparable<T>> T secondSmallest(T a, T b, T c) {
		T secondSmallest = null;
		T smallest = a;
		
		if (b.compareTo(smallest) == -1) {
			secondSmallest = smallest;
			smallest = b;
		}
		
		if (c.compareTo(smallest) == -1) {
			secondSmallest = smallest;
			smallest = c;
		}
		
		return secondSmallest;
	}
	
	public static int add(int a, int b) {
		int result = a;
		for (int i = a; i < b; i++) {
			result++;
		}
		return result;
	}
	
	public static <T extends Comparable<T>> T smallest(ArrayList<T> list) {
		int smallestIndex = 0;
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).compareTo(list.get(smallestIndex)) == -1)
				smallestIndex = i;
		}
		return list.get(smallestIndex);
	}
	
	public static <T extends Comparable<T>> T secondSmallest(ArrayList<T> list) throws Exception {
		
		if (list.size() < 2) throw new Exception("Not enough elements");
		
		int secondSmallestIndex = -1;
		int smallestIndex = 0;
		
		if (list.get(1).compareTo(list.get(smallestIndex)) == -1) {
			secondSmallestIndex = smallestIndex;
			smallestIndex = 1;
		}
		
		for (int i = 2; i < list.size(); i++) {
			if (list.get(i).compareTo(list.get(smallestIndex)) == -1) {
				//Smaller
				secondSmallestIndex = smallestIndex;
				smallestIndex = i;
			} else if (list.get(i).compareTo(list.get(smallestIndex)) == 0) {
				//Equal
				secondSmallestIndex = i;
			}
		}
		
		return list.get(secondSmallestIndex);
	}
	
	/**
	 * Finds first occurrence of the smallest element
	 * @param lst
	 * @return
	 * @runningTime Theta (n + m)
	 * - n : Find smallest element
	 * - m : Find first occurrence
	 */
	public static <T extends Comparable<T>> int firstOccurrenceOfSmallest_Slow(ArrayList<T> lst) {
		
		//Find smallest
		T smallest = smallest(lst);
		
		//Find first index of smallest
		int firstIndex = -1;
		
		for (int i = 0; i < lst.size(); i++) {
			if (lst.get(i).compareTo(smallest) == 0) {
				firstIndex = i;
				break;
			}
		}
		
		return firstIndex;
	}
	
	/**
	 * Finds first occurrence of the smallest element
	 * @param lst
	 * @return
	 * @runningTime Theta (n)
	 */
	public static <T extends Comparable<T>> int firstOccurrenceOfSmallest_Fast(ArrayList<T> lst) {
		
		T smallest = lst.get(0);
		int smallestIndex = 0;
		
		for (int i = 1; i < lst.size(); i++) {
			if (lst.get(i).compareTo(smallest) == -1) {
				smallest = lst.get(i);
				smallestIndex = 0;
			}
		}
		
		return smallestIndex;
	}
	
	/**
	 * Reverses an array
	 * @param lst
	 * @return
	 * @runningTime Theta (n)
	 */
	public static <T extends Comparable<T>> ArrayList<T> reverse(ArrayList<T> lst) {
		ArrayList<T> clone = new ArrayList<T>();
		
		for (int i = lst.size(); i > -1; i--) {
			clone.add(lst.get(i));
		}
		
		return clone;
	}
}
