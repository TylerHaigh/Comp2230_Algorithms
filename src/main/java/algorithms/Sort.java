package algorithms;

import java.util.List;
import datastructures.Heap;

public class Sort {

	public static void MergeSort() {
		
	}
	
	public static int ReturnOne() {
		return 1;
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
