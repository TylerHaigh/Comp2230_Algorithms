package algorithms;

import java.util.ArrayList;

import datastructures.BinaryTree;

public class Search {

	public static void DepthFirstSearch() {
		int count1 = 0;
		int count2 = 0;
		
	}
	
	public static <T extends Comparable<T>> int binarySearch(ArrayList<T> lst, T key) {
		int start = 0;
		int end = lst.size();
		
		while (start <= end) {
			int mid = (start + end) / 2;
			
			T midData = lst.get(mid);
			int compareVal = midData.compareTo(key);
			
			if (compareVal == 0)
				return mid;
			else if (compareVal == 1)
				end = mid - 1;
			else
				start = mid + 1;
		}
		
		return -1;
	}
	
	public static <T extends Comparable<T>> int binarySearchRec(ArrayList<T> lst, T key) {
		int start = 0;
		int end = lst.size();
		
		return binarySearchRec(lst, key, start, end);
	}
	
	private static <T extends Comparable<T>> int binarySearchRec(ArrayList<T> lst, T key, int start, int end) {
		if (start <= end) {
			int mid = (start + end) / 2;
			
			T midData = lst.get(mid);
			int compareVal = midData.compareTo(key);
			
			if (compareVal == 0)
				return mid;
			else if (compareVal == 1)
				return binarySearchRec(lst, key, start, mid - 1);
			else
				return binarySearchRec(lst, key, mid + 1, end);
		}
		
		return -1;
	}
	
}
