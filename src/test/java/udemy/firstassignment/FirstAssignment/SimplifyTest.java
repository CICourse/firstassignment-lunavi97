package udemy.firstassignment.FirstAssignment;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class SimplifyTest {

	JustDoIt justDoIt;

	@Before
	public void setUp() throws Exception {
		justDoIt = new JustDoItImpl();
	}

	@Test
	public void test1() throws Exception {
		int[] vector = {1, 2, 3};
		
		Assert.assertArrayEquals(vector, justDoIt.simplify(vector));
	}
	
	@Test
	public void test2() throws Exception {
		int[] vector = {5, 1, 7, 25, 3};
		int[] simplifiedVector = {1, 3, 5, 7, 25};
		
		Assert.assertArrayEquals(simplifiedVector, justDoIt.simplify(vector));
	}
	
	@Test
	public void test3() throws Exception {
		int[] vector = {4, 5, 10, 10, 11, 11};
		int[] simplifiedVector = {4, 5, 10, 11};
		
		Assert.assertArrayEquals(simplifiedVector, justDoIt.simplify(vector));
	}
	
	@Test
	public void test4() throws Exception {
		int[] vector = {9, 2, 3, 4, 10, 1, 9, 10, 2};
		int[] simplifiedVector = {1, 2, 3, 4, 9, 10};
		
		Assert.assertArrayEquals(simplifiedVector, justDoIt.simplify(vector));
	}
	
	@Test
	public void test5() throws Exception {
		int[] vector = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
		int[] simplifiedVector = {4};
		
		Assert.assertArrayEquals(simplifiedVector, justDoIt.simplify(vector));
	}
	
	@Test
	public void test6() throws Exception {
		int[] vector = {9, 9, 2, 3, 5, 2, 2, 4, 3, 8, 3, 9, 6};
		int[] simplifiedVector = {2, 3, 4, 5, 6, 8, 9};
		
		Assert.assertArrayEquals(simplifiedVector, justDoIt.simplify(vector));
		
	}

}
