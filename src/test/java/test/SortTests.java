package test;

import datastructures.Heap;
import algorithms.Sort;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

public class SortTests {

	@Test
  	public void heapSortTest() {
		Integer[] arr = new Integer[] { 5, 10, 1, 6, 3, 11, 2 };
		List<Integer> list = Arrays.asList(arr);

		List<Integer> sorted = Sort.heapSort(list);

		assertEquals(1, (int)sorted.get(0));
	}
	
	@Test
	public void mergeSortTest() {
		Integer[] arr = new Integer[] { 5, 10, 1, 6, 3, 11, 2 };
		List<Integer> list = Arrays.asList(arr);

		List<Integer> sorted = Sort.mergeSort(list);

		assertEquals(1, (int)sorted.get(0));
		assertEquals(2, (int)sorted.get(1));
		assertEquals(3, (int)sorted.get(2));
		assertEquals(5, (int)sorted.get(3));
		assertEquals(6, (int)sorted.get(4));
		assertEquals(10, (int)sorted.get(5));
		assertEquals(11, (int)sorted.get(6));
	}
}
