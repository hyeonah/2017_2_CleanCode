import static org.junit.Assert.*;
import org.junit.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SortingTest {

	@Test
	public void testAscendingOrderOfNumbers() throws Exception {
		Sorting s = new Sorting();
		int[] testDatum = {6,2,4};
		int[] ExpectedDatum = {2,4,6};
		s.datum = testDatum;
		s.size = testDatum.length;
		int[] resultDatum = s.sortAscendingOrder(s.datum);
		Assert.assertArrayEquals(ExpectedDatum,resultDatum);
	}
	
	@Test
	public void testAscendingOrderOfCharacters() throws Exception {
		Sorting s = new Sorting();
		int[] testDatum = {'c','i','a'};
		int[] ExpectedDatum = {'a','c','i'};
		s.datum = testDatum;
		s.size = testDatum.length;
		int[] resultDatum = s.sortAscendingOrder(s.datum);
		Assert.assertArrayEquals(ExpectedDatum,resultDatum);
	}
	
	@Test
	public void testDescendingOrderOfNumbers() throws Exception {
		Sorting s = new Sorting();
		int[] testDatum = {4,6,2};
		int[] ExpectedDatum = {6,4,2};
		s.datum = testDatum;
		s.size = testDatum.length;
		int[] resultDatum = s.sortDescendingOrder(s.datum);
		Assert.assertArrayEquals(ExpectedDatum,resultDatum);
	}
	
	@Test
	public void testDescendingOrderOfCharacters() throws Exception {
		int[] testDatum = {'c','i','a'};
		int[] ExpectedDatum = {'i','c','a'};
		Sorting s = new Sorting();
		s.datum = testDatum;
		s.size = testDatum.length;
		int[] resultDatum = s.sortDescendingOrder(s.datum);
		Assert.assertArrayEquals(ExpectedDatum,resultDatum);
	}
	
	@Test
	public void testSwapOfDatum() throws Exception {
		Sorting s = new Sorting();
		int[] testDatum = {1,8,3,39,4};
		int[] ExpectedDatum = {1,8,3,4,39};
		s.datum = testDatum;
		Assert.assertArrayEquals(ExpectedDatum,s.swapOfDatum(3,4));
	}
	
	@Test
	public void testPrintNumbers() throws Exception {
		Sorting s = new Sorting();
		int[] testDatum = {13,2,2,4,-2};
		int[] ExpectedDatum = {13,2,2,4,-2};
		s.datum = testDatum;
		s.size = testDatum.length;
		int[] resultDatum = s.printNumbers(s.datum);
		Assert.assertArrayEquals(ExpectedDatum,resultDatum);
	}
	
	@Test
	public void testPrintCharacters() throws Exception {
		Sorting s = new Sorting();
		int[] testDatum = {'a','c','i'};
		char[] ExpectedCharacters = {'a','c','i'};
		s.datum = testDatum;
		char[] resultCharacters = s.printCharacters(s.datum);
		Assert.assertArrayEquals(ExpectedCharacters,resultCharacters);
	}
}
