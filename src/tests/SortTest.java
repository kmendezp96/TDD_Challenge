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
        assertEquals(0, sortImplementation.generateRandom(10), "Must return a random integer between 0 and 10");
        assertEquals(0, sortImplementation.generateRandom(100), "Must return a random integer between 0 and 100");
        assertEquals(0, sortImplementation.generateRandom(43), "Must return a random integer between 0 and 43");
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
        assertEquals(listSorted, sortImplementation.sortList(listOriginal), "The sorted list and the one that return the sortList Method have to be equals");
    }
	
	@Test
	public void sortListShouldReturnAEmptyListWhenReceivesAEmptyList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		assertEquals(list, sortImplementation.sortList(list), "The sorted list and the one that return the sortList Method have to be equals");
		
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
        assertEquals(listSorted, sortImplementation.sortList(listOriginal), "The sorted list and the one that return the sortList Method have to be equals");
	}
	
	


}
