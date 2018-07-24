package udemy.firstassignment.FirstAssignment;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class AppTest {
	
	App app;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		app = new AppImpl();
	}

	@Test
	public void test() throws Exception {
		Assert.assertEquals(3, app.fibonacci(4));
		Assert.assertEquals(89, app.fibonacci(11));
		
		Assert.assertEquals(7, app.lucas(4));
		Assert.assertEquals(123, app.lucas(10));
		
		Assert.assertEquals(12, app.pell(4));
		Assert.assertEquals(985, app.pell(9));
		
		Assert.assertEquals(6, app.pellLucas(2));
		Assert.assertEquals(198, app.pellLucas(6));
		
		Assert.assertEquals(11, app.jacobsthal(5));
		Assert.assertEquals(2731, app.jacobsthal(13));
		
		Assert.assertEquals(31, app.jacobsthalLucas(5));
		Assert.assertEquals(2047, app.jacobsthalLucas(11));
		
		Assert.assertEquals(31, app.mersenne(5));
		Assert.assertEquals(4095, app.mersenne(12));
		
		Assert.assertEquals(17, app.fermat(2));
		Assert.assertEquals(65537, app.fermat(4));
		
		Assert.assertEquals(1093, app.repituno(7, 3));
		Assert.assertEquals(22621, app.repituno(5, 12));
		
		Assert.assertEquals(120, app.factorial(5));
		Assert.assertEquals(479001600, app.factorial(12));
	}

}
