package com.oracle.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloControllor {
	
	@GetMapping(path = "/sayHello")
	public String sayHello() {
		return "hello";
	}

}
