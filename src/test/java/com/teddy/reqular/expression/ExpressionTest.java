package com.teddy.reqular.expression;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.Test;

public class ExpressionTest {

	@Test
	public void test() {
		
		assertTrue(Pattern.matches("(\\d|\\D)*&#[0-9]{2,3};(\\d|\\D)*", "동ac1232&#40;동해물"));	// 숫자가 아니고 
		assertFalse(Pattern.matches("(\\d|\\D)*&#[0-9]{2,3};(\\d|\\D)*", "동ac1232&#4사람 인;동해물")); 
		assertFalse(Pattern.matches("\\w*", "동ac1232&#4사람 인;동해물"));
		assertTrue(Pattern.matches("\\w*", "동ac1234사람인동해물"));	// [0-9A-Za-z_] 와 동
	}
}
