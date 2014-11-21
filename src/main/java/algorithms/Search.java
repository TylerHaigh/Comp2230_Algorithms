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
	
	public static String depthFirstSearch(Graph g, int start) {
		unmarkAll(g);
		return depthFirstSearchRec(g, start);
	}
	
	private static String depthFirstSearchRec(Graph g, int start) {
		Vertex v = g.getVertex(start);
		String result = v.toString();
		
		v.setMarked(true);
		
		for (Vertex w : v.getAdjacentVertices()) {
			if (!w.isMarked()) {
				result += depthFirstSearchRec(g, g.getList().indexOf(w));
			}
		}
		
		return result;
	}
	
	private static void unmarkAll(Graph g) {
		int n = g.size();
		for (int i = 0; i < n; i++) {
			Vertex v = g.getVertex(i);
			v.setMarked(false);
		}
	}
	
	public static String bredthFirstSearch(Graph g, int start) {
		unmarkAll(g);
		
		String result = "";
		Queue<Vertex> queue = new LLQueue<Vertex>();
		
		Vertex first = g.getVertex(start);
		result += first.toString();
		
		queue.enqueue(first);
		while (!queue.empty()) {
			Vertex current = queue.front();
			queue.dequeue();
			int travelCount = 0;
			Vertex travel = current.getAdjacentVertexAt(travelCount);
			while (travel != null && travelCount < current.numEdgesOut() - 1) {
				if (!travel.isMarked()) {
					travel.setMarked(true);
					result += travel.toString();
					queue.enqueue(travel);
				}
				
				travelCount++;
				travel = current.getAdjacentVertexAt(travelCount);
			}
		}
		
		return result;
	}
	
}
