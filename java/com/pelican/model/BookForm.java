package com.pelican.model;

import lombok.Data;

@Data
public class BookForm {
	private String id = "";
	private String name = "";
	private String author = "";
	private String picture = "";
	private int price;
}
