package udemy.firstassignment.FirstAssignment;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SumOddNumberTest {

	JustDoIt justDoIt;

	@Before
	public void setUp() throws Exception {
		justDoIt = new JustDoItImpl();
	}

	@Test
	public void test1() throws Exception {
		int[] vector = null;
		
		Assert.assertEquals(0, justDoIt.sumOddNumber(vector));
	}
	
	@Test
	public void test2() throws Exception {
		int[] vector = {1, 2, 3, 4, 5};
		
		Assert.assertEquals(9, justDoIt.sumOddNumber(vector));
	}
	
	@Test
	public void test3() throws Exception {
		int[] vector = {2, 4, 8, 16, 32, 64, 128};
		
		Assert.assertEquals(0, justDoIt.sumOddNumber(vector));
	}
	
	@Test
	public void test4() throws Exception {
		int[] vector = {7, 1, 3};
		
		Assert.assertEquals(11, justDoIt.sumOddNumber(vector));
	}
	
	@Test
	public void test5() throws Exception {
		int[] vector = {9, 2, 3, 4, 3, 1, 11, 9, 8};
		
		Assert.assertEquals(36, justDoIt.sumOddNumber(vector));
	}

}
