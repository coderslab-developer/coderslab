package com.coderslab.controller;

import org.springframework.stereotype.Controller;
/**
 * @author Zubayer Ahamed
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping
	public String loadHomePage() {
		return "views/dashboard/index";
	}
}
