package udemy.firstassignment.FirstAssignment;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class MostRepeatedTest {

	JustDoIt justDoIt;

	@Before
	public void setUp() throws Exception {
		justDoIt = new JustDoItImpl();
	}

	@Test
	public void test1() throws Exception {
		long[] vector = {1L};
		
		Assert.assertEquals(1L, justDoIt.mostRepeated(vector));
	}

	@Test
	public void test2() throws Exception {
		long[] vector = {3L, 3L, 3L, 3L};
		
		Assert.assertEquals(3L, justDoIt.mostRepeated(vector));
	}
	
	@Test
	public void test3() throws Exception {
		long[] vector = {5L, 5L, 4L, 2L, 4L, 1L, 4L};
		
		Assert.assertEquals(4L, justDoIt.mostRepeated(vector));
	}
	
	@Test
	public void test4() {
		long[] vector = {1L, 2L, 3L, 4L};
		
		long mRepeatedElement = 0;
		try {
			mRepeatedElement = justDoIt.mostRepeated(vector);
		} catch (Exception e) {
			Assert.assertEquals("The most repeated element doesn't exist", e.getMessage());
			return;
		}
		
		Assert.assertTrue("The most repeated element is: " + mRepeatedElement, false);
	}
}
