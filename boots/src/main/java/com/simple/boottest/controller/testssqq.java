package com.simple.boottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/ttes")
public class testssqq {
	
	@GetMapping("/main")
	public String main() {
		return "/mem/tests";
	}

}
