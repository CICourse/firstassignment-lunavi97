package udemy.firstassignment.FirstAssignment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	CentralElementTest.class, CommonElementsTest.class, IsMagicSquareTest.class, 
	IsPalindromeTest.class,	MostRepeatedTest.class, MoveZerosToTheRightTest.class,
	SimplifyTest.class, SumOddNumberTest.class
})
public class AllTests {

}
