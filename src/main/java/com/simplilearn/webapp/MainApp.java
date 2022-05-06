package com.simplilearn.webapp;

import com.simplilearn.webapp.bean.Product;

public class MainApp {

	public static void main(String[] args) {
		
		// Tightly coupled classes  :: create object of product
		Product product = new Product();
		product.setId(100001);
		product.setName("Apple Mac book QUEHW73 model");
		product.setPrice(4564.56);
		product.setBrand("apple");
		product.setDescription("It is a laptop");
		product.setStatus(true);
		
		System.out.println(product);

	}

}
