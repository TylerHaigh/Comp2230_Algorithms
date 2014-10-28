import datastructures.Heap;
import algorithms.Sort;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

public class SortTests {

	@Test
	public void testJUnit() {
		int one = 1;
		int val = Sort.ReturnOne();
		
		assertEquals(one,val);
	}

  @Test
  public void heapSortTest() {
    Integer[] arr = new Integer[] { 5, 10, 1, 6, 3, 11, 2 };
    List<Integer> list = Arrays.asList(arr);

    List<Integer> sorted = Sort.heapSort(list);

    assertEquals(1, (int)sorted.get(0));
  }
}
