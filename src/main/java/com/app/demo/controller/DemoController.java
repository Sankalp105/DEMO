package com.app.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/count")
	public String characterCount(@RequestParam String word) {// 6
		String last=new String();
		String regex = "[A-Za-z]+";
		if (!word.matches(regex)) {// 5
			return "Invalid String";
		} // 5

		for (int i = 0; i < word.length(); i++) { // 1
			char currentChar = word.charAt(i);
			boolean isPassed = false;

			for (int j = 0; j < i; j++) { // 2
				if (word.charAt(j) == currentChar) {
					isPassed = true;
					break;
				}
			} // 2
			if (isPassed) { // 3
				continue;
			} // 3

			int count = 0;
			for (int k = 0; k < word.length(); k++) {// 4
				if (word.charAt(k) == currentChar) {
					count++;
				}
			}
			last = last + " " +("(" + currentChar + ")" + " is occured " + count + " times");
		} // 1 

		return last;

	}// 6

}
