package com.teddy.reqular.expression;

import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		
		assertTrue(Pattern.matches("&#[0-9]{2,3};*", "&#40;동해물"));	// 숫자가 아니고 
	}
}
