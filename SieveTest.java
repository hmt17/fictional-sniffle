package deliverable6;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class SieveTest {
	@Rule
    public ExpectedException thrown= ExpectedException.none();

	String[] correctArg = {"22"};
	String[] wrongArg1 = {""};
	String[] wrongArg2 = {"-22"};
	/*
	 * Check that when calculateMax() has acceptable parameter 
	 * it outputs correct results
	 */
	@Test
	public void testCalculateMaxWithParameter() {
		
		int result = Sieve.calculateMax(correctArg);
		//System.out.println(result);
		Assert.assertTrue(result == 22);
	}

	/*
	 * Check that when calculateMax() has unacceptable parameter 
	 * it results in exception thrown
	 */
	@Test
	public void testCalculateMaxWithoutParameter() {
		thrown.expect(IllegalArgumentException.class);
		Sieve.calculateMax(wrongArg1);
	}
	
	/*
	 * Check that when calculateMax() has unacceptable parameter 
	 * it results in exception thrown
	 */
	@Test
	public void testCalculateMaxWithBadParameter() {
		thrown.expect(IllegalArgumentException.class);
		Sieve.calculateMax(wrongArg2);
	}
}
