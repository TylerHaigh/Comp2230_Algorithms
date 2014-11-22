package algorithms;

import java.util.ArrayList;
import java.util.List;

import datastructures.Heap;

public class Sort {

	public static <T extends Comparable<T>> List<T> mergeSort(List<T> array) {
		int start = 0;
		int end = array.size() - 1;
		return mergeSort(array, start, end);
	}
	
	private  static <T extends Comparable<T>> List<T> mergeSort(List<T> array, int start, int end) {
		if(start == end) return array;
		
		int mid = (start + end) / 2;
		array = mergeSort(array, start, mid);
		array = mergeSort(array, mid + 1, end);
		
		return merge(array, start, mid, end);
	}
	
	private static <T extends Comparable<T>> List<T> merge(List<T> array, int start, int mid, int end) {
		int firstIndex = start;
		int secondIndex = mid + 1;
		
		List<T> sortedList = new ArrayList<T>();
		
		while (firstIndex <= mid && secondIndex <= end) {
			T first = array.get(firstIndex);
			T second = array.get(secondIndex);
			int compareVal = first.compareTo(second);
			
			if (compareVal == -1) {
				sortedList.add(first);
				firstIndex++;
			} else {
				sortedList.add(second);
				secondIndex++;
			}
		}
		
		//Copy remainder of first half
		while (firstIndex <= mid) {
			sortedList.add(array.get(firstIndex));
			firstIndex++;
		}
		
		//Copy remainder of first half
		while (secondIndex <= end) {
			sortedList.add(array.get(secondIndex));
			secondIndex++;
		}
		
		int sortedIndex = 0;
		for (int i = start; i <= end; i++) {
			array.set(i, sortedList.get(sortedIndex));
			sortedIndex++;
		}
		
		return array;
	}
	
	public static List heapSort(List array) {
		Heap.heapify(array);

		for (int i = array.size() - 1; i > 1; i--) {
			swap(array, 0, i);

			Heap.siftdown(array, 1);
		}

		return array;
	}

	private static void swap(List array, int i, int j) {
		Object temp = array.get(i);
		array.set(i, array.get(j));
		array.set(j, temp);
	}
}
