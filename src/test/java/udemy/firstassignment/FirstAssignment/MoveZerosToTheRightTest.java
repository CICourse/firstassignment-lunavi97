package udemy.firstassignment.FirstAssignment;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class MoveZerosToTheRightTest {

	JustDoIt justDoIt;

	@Before
	public void setUp() throws Exception {
		justDoIt = new JustDoItImpl();
	}

	@Test
	public void test1() throws Exception {
		int[] vector = {1, 2, 3, 4, 5};
		
		Assert.assertEquals(vector, justDoIt.moveZerosToTheRight(vector));
	}
	
	@Test
	public void test2() throws Exception {
		int[] vector = {0, 2, 4, 8};
		int[] vRes = {2, 4, 8, 0};
		
		Assert.assertEquals(vRes, justDoIt.moveZerosToTheRight(vector));
	}
	
	@Test
	public void test3() throws Exception {
		int[] vector = {0, 0, 0, 8, 4, 8, 2, 1};
		int[] vRes = {8, 4, 8, 2, 1, 0, 0, 0};
		
		Assert.assertEquals(vRes, justDoIt.moveZerosToTheRight(vector));
	}
	
	@Test
	public void test4() throws Exception {
		int[] vector = {2, 4, 0, 1, 9, 0, 0, 2, 8, 7, 0, 7, 5, 0, 25, 101};
		int[] vRes = {2, 4, 1, 9, 2, 8, 7, 7, 5, 25, 101, 0, 0, 0, 0, 0};
		
		Assert.assertEquals(vRes, justDoIt.moveZerosToTheRight(vector));
	}
	
	@Test
	public void test5() throws Exception {
		int[] vector = {0, 0, 0};
		
		Assert.assertEquals(vector, justDoIt.moveZerosToTheRight(vector));
	}
	
	@Test
	public void test6() throws Exception {
		int[] vector = null;
		
		Assert.assertEquals(null, justDoIt.moveZerosToTheRight(vector));
	}
	
	@Test
	public void test7() throws Exception {
		int[] vector = {0, 1, 2, 0, 3, 4, 0};
		int[] vRes = {1, 2, 3, 4, 0, 0, 0};
		
		Assert.assertEquals(vRes, justDoIt.moveZerosToTheRight(vector));
	}

}
