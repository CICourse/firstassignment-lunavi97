package udemy.firstassignment.FirstAssignment;

public class JustDoItImpl implements JustDoIt {

	/* (non-Javadoc)
	 * @see udemy.firstassignment.FirstAssignment.JustDoIt#centralElement(long[])
	 */
	@Override
	public long centralElement(long[] vector) throws Exception {
		int length = vector.length;
		
		return length % 2 == 1 ? vector[length / 2] : vector[(length - 1) / 2];
	}

	@Override
	public long mostRepeated(long[] vector) throws Exception {
		throw new RuntimeException("Unimplemented method");
	}

	@Override
	public int simplify(int[] vector) throws Exception {
		throw new RuntimeException("Unimplemented method");
	}

	@Override
	public boolean isPalindrome(int[] vector) throws Exception {
		throw new RuntimeException("Unimplemented method");
	}

	@Override
	public int[] commonElements(int[] vector, int[] vector2) throws Exception {
		throw new RuntimeException("Unimplemented method");
	}

	@Override
	public int[] moveZerosToTheRight(int[] vector) throws Exception {
		throw new RuntimeException("Unimplemented method");
	}

	@Override
	public boolean isMagicSquare(int[][] matrix) throws Exception {
		throw new RuntimeException("Unimplemented method");
	}

	@Override
	public int sumOddNumber(int[] vector) throws Exception {
		throw new RuntimeException("Unimplemented method");
	}

}
