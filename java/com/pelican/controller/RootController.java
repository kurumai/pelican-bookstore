package com.pelican.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pelican.model.BookForm;

@Controller
public class RootController {

	@RequestMapping("/home")
	public ModelAndView show(ModelAndView mav) {
		List<BookForm> books = new ArrayList<BookForm>();

		BookForm form1 = new BookForm();
		form1.setId("1");
		form1.setName("Learning CircleCI");
		form1.setAuthor("Circle Taro");
		form1.setPicture("/image/circleci1.png");
		form1.setPrice(2980);
		books.add(form1);

		BookForm form2 = new BookForm();
		form2.setId("2");
		form2.setName("Mastering CircleCI");
		form2.setAuthor("Circle Jiro");
		form2.setPicture("/image/circleci2.png");
		form2.setPrice(3980);
		books.add(form2);

		BookForm form3 = new BookForm();
		form3.setId("3");
		form3.setName("CircleCI Cookbook");
		form3.setAuthor("Circle Saburou");
		form3.setPicture("/image/circleci3.png");
		form3.setPrice(6200);
		books.add(form3);

		mav.addObject("books", books);
		mav.setViewName("/home.html");

		return mav;
	}
}
