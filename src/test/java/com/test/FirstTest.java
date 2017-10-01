package com.test;

import org.junit.Test;

import junit.framework.TestCase;

public class FirstTest extends TestCase {
	
@Test
public void testFun() {
	
	int a = 5;
	int b = 6;
	int c= a+b;
	assertTrue(c==12);
}

}
