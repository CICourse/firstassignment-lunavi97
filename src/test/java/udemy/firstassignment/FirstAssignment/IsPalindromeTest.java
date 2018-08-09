package udemy.firstassignment.FirstAssignment;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class IsPalindromeTest {

	JustDoIt justDoIt;

	@Before
	public void setUp() throws Exception {
		justDoIt = new JustDoItImpl();
	}
	
	@Test
	public void isPalindrome1() throws Exception {
		int[] vector = {4, 4, 4, 4};
		
		Assert.assertTrue(justDoIt.isPalindrome(vector));
	}

	@Test
	public void isPalindrome2() throws Exception {
		int[] vector = {1, 2, 3, 2, 1};
		
		Assert.assertTrue(justDoIt.isPalindrome(vector));
	}
	
	@Test
	public void isPalindrome3() throws Exception {
		int[] vector = {5, 8, 9, 9, 8, 5};
		
		Assert.assertTrue(justDoIt.isPalindrome(vector));
	}
	
	@Test
	public void isPalindrome4() throws Exception {
		int[] vector = {2, 3, 5, 3, 7, 3, 5, 3, 2};
		
		Assert.assertTrue(justDoIt.isPalindrome(vector));
	}
	
	@Test
	public void isPalindrome5() throws Exception {
		int[] vector = {9, 5, 10, 5, 9};
		
		Assert.assertTrue(justDoIt.isPalindrome(vector));
	}
	
	@Test
	public void isPalindrome6() throws Exception {
		int[] vector = {2, 6, 3, 1, 8, 2, 6, 7, 6, 2, 8, 1, 3, 6, 2};
		
		Assert.assertTrue(justDoIt.isPalindrome(vector));
	}
	
	@Test
	public void isNotPalindrome1() throws Exception {
		int[] vector = {1, 1, 1, 1, 1, 2};
		
		Assert.assertFalse(justDoIt.isPalindrome(vector));
	}
	
	@Test
	public void isNotPalindrome2() throws Exception {
		int[] vector = {2, 1, 1, 1, 1, 1};
		
		Assert.assertFalse(justDoIt.isPalindrome(vector));
	}
	
	@Test
	public void isNotPalindrome3() throws Exception {
		int[] vector = {4, 4, 8, 8, 4, 4, 8, 8};
		
		Assert.assertFalse(justDoIt.isPalindrome(vector));
	}
	
	@Test
	public void isNotPalindrome4() throws Exception {
		int[] vector = {3, 4, 5, 4, 3, 2};
		
		Assert.assertFalse(justDoIt.isPalindrome(vector));
	}
	
	@Test
	public void isNotPalindrome5() throws Exception {
		int[] vector = {4, 8, 16, 16, 8, 4, 2};
		
		Assert.assertFalse(justDoIt.isPalindrome(vector));
	}
	
	@Test
	public void isNotPalindrome6() throws Exception {
		int[] vector = {9, 5, 10, 5, 9, 5};
		
		Assert.assertFalse(justDoIt.isPalindrome(vector));
	}
	
	@Test
	public void isNotPalindrome7() throws Exception {
		int[] vector = {2, 4, 8, 2, 4, 8, 2, 4, 8};
		
		Assert.assertFalse(justDoIt.isPalindrome(vector));
	}
	
	@Test
	public void isNotPalindrome8() throws Exception {
		int[] vector = {5, 9, 3, 7, 9, 2, 3, 4, 3, 2, 9, 7, 3, 9};
		
		Assert.assertFalse(justDoIt.isPalindrome(vector));
	}

}
