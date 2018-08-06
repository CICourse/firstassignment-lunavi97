package udemy.firstassignment.FirstAssignment;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CentralElementTest {

	JustDoIt justDoIt;

	@Before
	public void setUp() throws Exception {
		justDoIt = new JustDoItImpl();
	}

	@Test
	public void test1() throws Exception {
		long[] vector = {29302100L, 30291029304L, 23132019L, 1292930L, 99920102L};
		Assert.assertEquals(23132019L, justDoIt.centralElement(vector));
	}
	
	@Test
	public void test2() throws Exception {
		long[] vector = {123L, 231L, 931L, 560L, 600L, 390L};
		Assert.assertEquals(931L, justDoIt.centralElement(vector));
	}

}
