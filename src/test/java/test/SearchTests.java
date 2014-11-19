package test;

import org.junit.Test;

import datastructures.Graph;
import datastructures.Vertex;
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
	
	@Test
	public void testDepthFirstSearch() {
		Graph g = new Graph();
		
		Vertex one = new Vertex();
		Vertex two = new Vertex();
		Vertex three = new Vertex();
		Vertex four = new Vertex();
		
		/*
		 * one -----> two
		 *  |
		 *  |
		 *  |
		 *  v
		 *  three --> four
		 */
		
		g.add(one, 0);
		g.add(two, 0);
		g.add(three, 0);
		g.add(two, 1);
		g.add(three, 2);
		g.add(four, 2);
		g.add(four, 3);
		
		assertEquals(true, Search.depthFirstSearch(g, 0, four));
	}
}
