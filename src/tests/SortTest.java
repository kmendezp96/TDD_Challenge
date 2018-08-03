package tests;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;

import logical.sortImplementation;

public class SortTest {

	
	@Test
	public void generateRandomShouldReturnARandomNumberBetweenZeroAndOneLimit() {
        // assert statements
		assertTrue("Must return a random integer between 0 and 10", ((10>sortImplementation.generateRandom(10))&&(0<sortImplementation.generateRandom(10))));
		assertTrue("Must return a random integer between 0 and 100", ((100>sortImplementation.generateRandom(10))&&(0<sortImplementation.generateRandom(10))));
		assertTrue("Must return a random integer between 0 and 43", ((43>sortImplementation.generateRandom(10))&&(0<sortImplementation.generateRandom(10))));
    }
	
	@Test
	public void sortListShouldReturnASortedList() {
        // assert statements
		ArrayList<Integer> listOriginal = new ArrayList<Integer>();
		listOriginal.add(4);
		listOriginal.add(3);
		listOriginal.add(46);
		listOriginal.add(2);
		listOriginal.add(17);
		listOriginal.add(21);
		listOriginal.add(10);
		ArrayList<Integer> listSorted = new ArrayList<Integer>(listOriginal);
		Collections.sort(listSorted);		
        assertEquals("The sorted list and the one that return the sortList Method have to be equals",listSorted, sortImplementation.sortList(listOriginal));
    }
	
	@Test
	public void sortListShouldReturnAEmptyListWhenReceivesAEmptyList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		assertEquals("Must return an empty list",list, sortImplementation.sortList(list));
		
	}
	
	@Test
	public void sortListShouldReturnASortedListEvenWhenTheListHaveNegativesNumbersOrZeros() {
		ArrayList<Integer> listOriginal = new ArrayList<Integer>();
		listOriginal.add(4);
		listOriginal.add(-3);
		listOriginal.add(46);
		listOriginal.add(0);
		listOriginal.add(17);
		listOriginal.add(-21);
		listOriginal.add(-10);
		ArrayList<Integer> listSorted = new ArrayList<Integer>(listOriginal);
		Collections.sort(listSorted);		
        assertEquals("The sorted list and the one that return the sortList Method have to be equals",listSorted, sortImplementation.sortList(listOriginal));
	}
	
	


}
