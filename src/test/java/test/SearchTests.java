package test;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;
import algorithms.Search;

public class SearchTests {

	@Test
	public void testBinarySearch() {
		ArrayList<Integer> lst = new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		
		assertEquals(0, Search.binarySearch(lst, 1));
	}
	
	@Test
	public void testBinarySearchRecursive() {
		ArrayList<Integer> lst = new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		
		assertEquals(4, Search.binarySearchRec(lst, 5));
	}
}
