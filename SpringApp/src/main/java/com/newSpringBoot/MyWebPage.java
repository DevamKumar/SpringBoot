package com.newSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebPage {
	
	
	@GetMapping("/getData")
	public String getData() {
		return "Hello World!! my Spring App";
	}

}
