package jtm.activity11;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jtm.activity08.SimpleCalc;

public class SimpleCalcTest {

	/*
	 * TODO
	 *
	 * Write unit tests. Try to cover as many cases as possible, to have the highest
	 * coverage for SimpleCalc class in jtm.activity08
	 */

	SimpleCalc sc;

	@Before
	public void setUp() {
		// TODO initialize SimpleCalc object
		sc = new SimpleCalc();
	}

	@Test
	public void testAddInRange() {
		// TODO test addition for case where both numbers and result is in allowed range
		//int expected=5;
		//int actual=0;
		//assertEquals("2 + 3 should be 5", expected, actual);
		int resultA = sc.add(-4,7);
		Assert.assertEquals("Expected to be 3", 3, resultA);

		int resultB = sc.add(0,10);
		Assert.assertEquals("Expected to be 10", 10, resultB);

		int resultC = sc.add(5,5);
		Assert.assertEquals("Expected to be 10", 10, resultC);

		int resultD = sc.add(-5,-5);
		Assert.assertEquals("Expected to be -10", -10, resultD);

	}

	@Test
	public void testAddOutOfRange() {
		// TODO test addition for cases where both numbers and result is out of allowed range

		Integer AOutOfRange = sc.add(-11,8);
		Assert.assertNull("a is out of range", AOutOfRange);
		//Assert.assertEquals("Expected to be Exception (a is out of range)", null, AOutOfRange);

		Integer BOutOfRange = sc.add(8, -12);
		Assert.assertNull("b is out of range", BOutOfRange);
		//Assert.assertEquals("Expected to be Exception (b is out of range)", null, BOutOfRange);

		Integer resultOutOfRange = sc.add(-8,-5);
		Assert.assertNull("result is out of range", resultOutOfRange);
		//Assert.assertEquals("Expected to be Exception (result is out of range)", null, resultOutOfRange);

		Integer allOutOfRange = sc.add(-11,35);
		Assert.assertNull("a,b and result are out of range", allOutOfRange);
		//Assert.assertEquals("Expected to be Exception (a,b and result are out of range)", null, allOutOfRange);

	}

	@Test
	public void testSubtractInRange() {
		// TODO
		int resultA = sc.subtract(4,7);
		Assert.assertEquals("Expected to be -3", -3, resultA);

		int resultB = sc.subtract(10,0);
		Assert.assertEquals("Expected to be 10", 10, resultB);

		int resultC = sc.subtract(0,10);
		Assert.assertEquals("Expected to be -10", -10, resultC);

	}

	@Test
	public void testSubtractOutOfRange() {
		// TODO
		Integer AOutOfRange = sc.subtract(-12,-8);
		Assert.assertNull("a is out of range", AOutOfRange);

		Integer BOutOfRange = sc.subtract(10, 12);
		Assert.assertNull("b is out of range", BOutOfRange);

		Integer resultOutOfRange = sc.subtract(-8,5);
		Assert.assertNull("result is out of range", resultOutOfRange);

		Integer allOutOfRange = sc.subtract(15,-13);
		Assert.assertNull("a,b and result are out of range", allOutOfRange);

	}

	@Test
	public void testMultiplyInRange() {
		// TODO
		int resultA = sc.multiply(2,-4);
		Assert.assertEquals("Expected to be -8", -8, resultA);

		int resultB = sc.multiply(0,10);
		Assert.assertEquals("Expected to be 10", 0, resultB);

		int resultC = sc.multiply(2,5);
		Assert.assertEquals("Expected to be 10", 10, resultC);

		int resultD = sc.multiply(2,-5);
		Assert.assertEquals("Expected to be -10", -10, resultD);
	}

	@Test
	public void testMultiplyOutOfRange() {
		// TODO
		Integer AOutOfRange = sc.multiply(-12,1);
		Assert.assertNull("a is out of range", AOutOfRange);

		Integer BOutOfRange = sc.multiply(0, 12);
		Assert.assertNull("b is out of range", BOutOfRange);

		Integer resultOutOfRange = sc.multiply(-8,5);
		Assert.assertNull("result is out of range", resultOutOfRange);

		Integer allOutOfRange = sc.multiply(15,-13);
		Assert.assertNull("a,b and result are out of range", allOutOfRange);
	}

	@Test
	public void testDivideInRange() {
		// TODO
		int resultA = sc.divide(-8,4);
		Assert.assertEquals("Expected to be -2", -2, resultA);

		int resultB = sc.divide(0,10);
		Assert.assertEquals("Expected to be 0", 0, resultB);

		int resultC = sc.divide(10,-1);
		Assert.assertEquals("Expected to be -10", -10, resultC);

		int resultD = sc.divide(-10,1);
		Assert.assertEquals("Expected to be -10", -10, resultD);
	}

	@Test
	public void testDivideOutOfRange() {
		// TODO

		Integer AOutOfRange = sc.divide(-12,2);
		Assert.assertNull("a is out of range", AOutOfRange);

		Integer BOutOfRange = sc.divide(0, 12);
		Assert.assertNull("b is out of range", BOutOfRange);

		//int resultOutOfRange = sc.divide(-8,5);
		//Assert.assertNull("result is out of range", resultOutOfRange);

		Integer allOutOfRange = sc.divide(15,-13);
		Assert.assertNull("a,b and result are out of range", allOutOfRange);
	}

}
