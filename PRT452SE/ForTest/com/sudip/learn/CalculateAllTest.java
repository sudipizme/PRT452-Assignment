package com.sudip.learn;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculateAllTest {

	private static CalculateAll testing;
	@Before
	public void setUp() throws Exception {
		testing = new CalculateAll();
	}

	@Test
	public void testslope() {
		//fail("Not yet implemented");
		float x1 = 3;
		float y1 = 6;
		float x2 = 6;
		float y2 = 9;

		float res = (y2 - y1)/(x2 - x1);
		assertEquals(res, testing.slope(3, 6, 6, 9), 0.001);
	}

	@Test
	public void testdistance() {
		//fail("Not yet implemented");
		double x1 = 4;
		double y1 = 4;
		double x2 = 8;
		double y2 = 14;

		double res = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		assertEquals(res, testing.distance(4, 4, 8, 14), 0.001);
	}
	@Test
	public void testequation() {
		//fail("Not yet implemented");
		double x1 = 3;
		double y1 = 4;
		double x2 = 7;
		double y2 = 9;

		double res = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		assertEquals(res, testing.distance(3, 4, 7, 9), 0.001);
	}
	

}
