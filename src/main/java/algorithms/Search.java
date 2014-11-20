package algorithms;

import java.util.ArrayList;

import datastructures.*;

public class Search {

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
	
	public static String depthFirstSearch(Graph g, int start, Vertex key) {
		int n = g.size();
		for (int i = 0; i < n; i++) {
			Vertex v = g.getVertex(i);
			v.setMarked(false);
		}
		
		return depthFirstSearchRec(g, start, key);
	}
	
	private static String depthFirstSearchRec(Graph g, int start, Vertex key) {
		Vertex v = g.getVertex(start);
		String result = v.toString();
		
		v.setMarked(true);
		
		for (Vertex w : v.getAdjacentVertices()) {
			if (!w.isMarked()) {
				result += depthFirstSearchRec(g, g.getList().indexOf(w), key);
			}
		}
		
		return result;
	}
	
}
