package udemy.firstassignment.FirstAssignment;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CommonElementsTest {

	JustDoIt justDoIt;

	@Before
	public void setUp() throws Exception {
		justDoIt = new JustDoItImpl();
	}

	@Test
	public void noCommonElements1() throws Exception {
		int[] vector1 = {2, 4, 8, 16};
		int[] vector2 = {3, 5, 9, 32};

		Assert.assertEquals(null, justDoIt.commonElements(vector1, vector2));
	}
	
	@Test
	public void noCommonElements2() throws Exception {
		int[] vector1 = null;
		int[] vector2 = vector1;
		
		Assert.assertEquals(null, justDoIt.commonElements(vector1, vector2));
	}
	
	@Test
	public void noCommonElements3() throws Exception {
		int[] vector1 = {9, 3, 6, 2, 8, 5, 6};
		int[] vector2 = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
		
		Assert.assertEquals(null, justDoIt.commonElements(vector1, vector2));
	}

	@Test
	public void test1() throws Exception {
		int[] vector1 = {1, 2, 3, 4};
		int[] vector2 = vector1;

		Assert.assertEquals(vector1, justDoIt.commonElements(vector1, vector2));
	}

	@Test
	public void test2() throws Exception {
		int[] vector1 = {4, 8, 16, 32};
		int[] vector2 = {4, 8, 16, 64};
		
		int[] commonElements = {4, 8, 16};
		
		Assert.assertEquals(commonElements, justDoIt.commonElements(vector1, vector2));
	}
	
	@Test
	public void test3() throws Exception {
		int[] vector1 = {4, 8, 16, 32};
		int[] vector2 = {4, 2, 5, 7};
		
		int[] commonElements = {4};
		
		Assert.assertEquals(commonElements, justDoIt.commonElements(vector1, vector2));
	}
	
	@Test
	public void test4() throws Exception {
		int[] vector1 = {8, 2, 4, 3};
		int[] vector2 = {6, 5, 4, 7};
		
		int[] commonElements = {4};
		
		Assert.assertEquals(commonElements, justDoIt.commonElements(vector1, vector2));
	}
	
	@Test
	public void test5() throws Exception {
		int[] vector1 = {4, 1, 2, 3};
		int[] vector2 = {2, 3, 4, 4};
		
		int[] commonElements = {2, 3, 4};
		
		Assert.assertEquals(commonElements, justDoIt.commonElements(vector1, vector2));
	}
	
	@Test
	public void test6() throws Exception {
		int[] vector1 = {8, 8, 6, 2, 3, 11, 101};
		int[] vector2 = {1, 9, 2, 9, 25, 101, 2, 3, 4, 5, 1};
		
		int[] commonElements = {2, 3, 101};
		
		Assert.assertEquals(commonElements, justDoIt.commonElements(vector1, vector2));
	}
	
	@Test
	public void test7() throws Exception {
		int[] vector1 = {9, 2, 5, 1324, 100, 102, 9};
		int[] vector2 = {2, 2, 2, 2, 2};
		
		int[] commonElements = {2};
		
		Assert.assertEquals(commonElements, justDoIt.commonElements(vector1, vector2));
	}

}
