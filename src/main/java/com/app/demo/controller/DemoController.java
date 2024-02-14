package com.app.demo.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/count")
	public String characterCount(@RequestParam String word) {
	    if (!word.matches("[A-Za-z]+")) {
	        return "Invalid String";
	    }

	    Map<Character, Integer> charCountMap = new HashMap<>();

	    for (char c : word.toCharArray()) {
	        charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	    }

	    StringBuilder result = new StringBuilder();
	    for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	        result.append("(").append(entry.getKey()).append(") is occurred ").append(entry.getValue()).append(" times ");
	    }
	    return result.toString();
	}


}
