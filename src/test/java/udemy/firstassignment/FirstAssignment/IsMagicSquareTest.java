package udemy.firstassignment.FirstAssignment;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class IsMagicSquareTest {

	JustDoIt justDoIt;

	@Before
	public void setUp() throws Exception {
		justDoIt = new JustDoItImpl();
	}

	@Test
	public void isMagicSquare1() throws Exception {
		int[][] matrix = {
				{1, 1, 1},
				{1, 1, 1},
				{1, 1, 1}
		};
		
		Assert.assertTrue(justDoIt.isMagicSquare(matrix));
	}
	
	@Test
	public void isMagicSquare2() throws Exception {
		int[][] matrix = {
				{16, 3, 2, 13},
				{5, 10, 11, 8},
				{9, 6, 7, 12},
				{4, 15, 14, 1}
		};
		
		Assert.assertTrue(justDoIt.isMagicSquare(matrix));
	}
	
	@Test
	public void isMagicSquare3() throws Exception {
		int[][] matrix = {
				{68, 65, 96, 93, 4, 1, 32, 29, 60, 57},
				{66, 67, 94, 95, 2, 3, 30, 31, 58, 59},
				{92, 89, 20, 17, 28, 25, 56, 53, 64, 61},
				{90, 91, 18, 19, 26, 27, 54, 55, 62, 63},
				{16, 13, 24, 21, 49, 52, 80, 77, 88, 85},
				{14, 15, 22, 23, 50, 51, 78, 79, 86, 87},
				{37, 40, 45, 48, 76, 73, 81, 84, 9, 12},
				{38, 39, 46, 47, 74, 75, 82, 82, 10, 11},
				{41, 44, 69, 72, 97, 100, 5, 8, 33, 36},
				{43, 42, 71, 70, 99, 98, 7, 6, 35, 34}
		};
		
		Assert.assertTrue(justDoIt.isMagicSquare(matrix));
	}
	
	@Test
	public void isNotMagicSquare1() throws Exception {
		int[][] matrix = {
				{1, 2, 3, 4},
				{1, 2, 3, 4},
				{1, 2, 3, 4},
				{1, 2, 3, 4}
		};
		
		Assert.assertFalse(justDoIt.isMagicSquare(matrix));
	}
	
	@Test
	public void isNotMagicSquare2() throws Exception {
		int[][] matrix = {
				{2, 2, 2, 2},
				{3, 3, 3, 3},
				{4, 4, 4, 4},
				{5, 5, 5, 5}
		};
		
		Assert.assertFalse(justDoIt.isMagicSquare(matrix));
	}
	
	@Test
	public void isNotMagicSquare3() throws Exception {
		int[][] matrix = {
				{1, 1, 1, 1},
				{1, 2, 2, 1},
				{1, 2, 2, 1},
				{1, 1, 1, 1}
		};
		
		Assert.assertFalse(justDoIt.isMagicSquare(matrix));
	}
	
	@Test
	public void isNotMagicSquare4() throws Exception {
		int[][] matrix = {
				{67, 65, 96, 93, 4, 1, 32, 29, 60, 57},
				{66, 67, 94, 95, 2, 3, 30, 31, 58, 59},
				{92, 89, 20, 17, 28, 25, 56, 53, 64, 61},
				{90, 91, 18, 19, 26, 27, 54, 55, 62, 63},
				{16, 13, 24, 21, 48, 51, 80, 77, 88, 85},
				{14, 15, 22, 23, 52, 50, 78, 79, 86, 87},
				{37, 40, 45, 48, 76, 73, 81, 84, 9, 12},
				{38, 39, 46, 47, 74, 75, 82, 82, 10, 11},
				{41, 44, 69, 72, 97, 100, 5, 8, 33, 36},
				{43, 42, 71, 70, 99, 98, 7, 6, 35, 34}
		};
		
		Assert.assertFalse(justDoIt.isMagicSquare(matrix));
	}

}
