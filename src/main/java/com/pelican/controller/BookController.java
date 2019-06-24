package com.pelican.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.pelican.model.BookForm;

@Controller
public class BookController {

	@RequestMapping("/")
	public String redirectToHome() {
		return "redirect:home";
	}
}
