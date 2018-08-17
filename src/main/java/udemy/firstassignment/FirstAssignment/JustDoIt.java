package udemy.firstassignment.FirstAssignment;

public interface JustDoIt 
{
	/**
	 * Returns if vector.length even vector.length / 2 else (vector.length - 1) / 2.
	 * 
	 * @param vector
	 * @return
	 * @throws Exception
	 */
	public abstract long centralElement(long[] vector) throws Exception;
	
	/**
	 * Returns the most repeated element.
	 * 
	 * @param vector
	 * @return
	 * @throws Exception
	 */
	public abstract long mostRepeated(long[] vector) throws Exception;
	
	/**
	 * Returns a sorted vector with no duplicates.
	 * 
	 * @param vector
	 * @return a sorted vector with no duplicates
	 * @throws Exception
	 */
	public abstract int[] simplify(int[] vector) throws Exception;
	
	/**
	 * Returns if vector is palindrome.
	 * 
	 * @param vector
	 * @return true, if vector is palindrome; false otherwise
	 * @throws Exception
	 */
	public abstract boolean isPalindrome(int[] vector) throws Exception;
	
	/**
	 * Returns a vector with the common elements between two vectors.
	 * 
	 * @param vector1
	 * @param vector2
	 * @return an array with sorted elements in both arrays
	 * @throws Exception
	 */
	public abstract int[] commonElements(int[] vector1, int[] vector2) throws Exception;
	
	/**
	 * Move all zeros to the end of an array.
	 * 
	 * @param vector
	 * @return an array with all zeros to the right
	 * @throws Exception
	 */
	public abstract int[] moveZerosToTheRight(int[] vector) throws Exception;
	
	/**
	 * Returns if a matrix is a magic square.
	 * If this is a square matrix in which the sum of every row, column and
	 * both diagonals is the same.
	 * 
	 * @param matrix
	 * @return true, if matrix is a magic; false otherwise
	 * @throws Exception
	 */
	public abstract boolean isMagicSquare(int[][] matrix) throws Exception;
	
	/**
	 * Returns sum of odd numbers of an array.
	 * 
	 * @param vector
	 * @return the sum of all odd (senars) numbers
	 * @throws Exception
	 */
	public abstract int sumOddNumber(int[] vector) throws Exception;
}
