package com.impactsure.suretrack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	
	@RequestMapping(value="/")
	public String Demo()
	{
		return "demo";
	}
}
