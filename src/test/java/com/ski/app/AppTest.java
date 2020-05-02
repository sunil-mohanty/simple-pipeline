package com.ski.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ski.model.Variable;

/**
 * Unit test for simple App.
 */
public class AppTest {

	
@Test
	public void testConcat() {

		Variable var1 = new Variable(7);
		Variable var2 = new Variable(11);

		Multiplier multiplier = new Multiplier();
		assertEquals(7*11 , multiplier.multiply(var1, var2),0);
	}
}
