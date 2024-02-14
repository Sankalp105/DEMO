package com.app.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.app.demo.controller.DemoController;

public class DemoControllerTest {

	DemoController demoController;
	
	@BeforeEach
	void setUp() {
		demoController = new DemoController();
	}
	
	@Test
	void testCharacterCount() {
		assertEquals("Invalid String",demoController.characterCount("hb487893vhvu%"));
	}
	
	@Test
	void testCharacterCount1() {
		assertEquals("(b) is occurred 1 times (S) is occurred 1 times (c) is occurred 1 times (E) is occurred 1 times (u) is occurred 1 times (F) is occurred 1 times (v) is occurred 1 times (y) is occurred 1 times (I) is occurred 1 times ",demoController.characterCount("ybSFEIuvc"));
		assertEquals("Invalid String",demoController.characterCount("GTEsfr34"));
	}
}
