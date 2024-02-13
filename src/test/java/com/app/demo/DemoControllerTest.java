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
		assertEquals(" (g) is occured 2 times (y) is occured 1 times (e) is occured 2 times (b) is occured 2 times (j) is occured 1 times (u) is occured 1 times",demoController.characterCount("gygebjbeu"));
		assertEquals("Invalid String",demoController.characterCount("GTEsfr34"));
	}
}
