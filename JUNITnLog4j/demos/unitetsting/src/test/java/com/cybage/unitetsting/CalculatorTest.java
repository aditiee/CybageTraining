package com.cybage.unitetsting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import javax.management.MXBean;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorTest {
	Calculator myCalculator;
	
	@Before
	public void setup() {
		System.out.println("inside before");
		 myCalculator=new Calculator();
	}
	
	@After
	public void tearDown() {
		System.out.println("inside After");
		myCalculator=null;
	}
	
	@BeforeClass
	public static void setupClass() {
		System.out.println("inside Before Class");
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("inside After Class");
	}
	
	@Test
	public void test_add_positiveValues(){
		System.out.println("test1");
		
		assertEquals(4, myCalculator.add(2,2));
	}
	
	@Test
	public void test_add_negativeValues(){
		System.out.println("test2");
		Calculator myCalculator=new Calculator();
		assertEquals(0, myCalculator.add(-2,2));
	}
	
	@Ignore
	@Test
	public void test_sub_positiveValues(){
			
		assertEquals(4,  myCalculator.substract(8, 4));
	}
	

	@Test(expected=ArithmeticException.class)
	public void test_diviosn_zero(){
		
		assertEquals(-2, myCalculator.division(4, 0));
	}
	
	
	@Test(timeout=1100)
	public void test_multiply_timeout(){
		
		assertEquals(15, myCalculator.mul(3,5));
	}
	
}
