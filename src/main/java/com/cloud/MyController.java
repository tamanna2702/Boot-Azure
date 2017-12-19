package com.cloud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	 @RequestMapping("/hello")
	    public String index() {
	        return "Greetings from Spring Boot!";
	    }
}