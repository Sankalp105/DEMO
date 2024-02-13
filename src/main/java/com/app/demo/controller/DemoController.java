package com.app.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/count")
	public String characterCount(@RequestParam String word) {
		String last = new String();
		String regex = "[A-Za-z]+";
		if (!word.matches(regex)) {
			return "Invalid String";
		}

		for (int i = 0; i < word.length(); i++) {
			char currentChar = word.charAt(i);
			boolean isPassed = false;

			for (int j = 0; j < i; j++) {
				if (word.charAt(j) == currentChar) {
					isPassed = true;
					break;
				}
			}
			if (isPassed) {
				continue;
			}

			int count = 0;
			for (int k = 0; k < word.length(); k++) {
				if (word.charAt(k) == currentChar) {
					count++;
				}
			}
			last = last + " " + ("(" + currentChar + ")" + " is occured " + count + " times");
		}

		return last;

	}

}
