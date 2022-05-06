package com.simplilearn.webapp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.simplilearn.webapp.bean.Product;

public class MainApp {

	public static void main(String[] args) {
		
		// Tightly coupled classes  :: create object of product
//		Product product = new Product();
//		product.setId(100001);
//		product.setName("Apple Mac book QUEHW73 model");
//		product.setPrice(4564.56);
//		product.setBrand("apple");
//		product.setDescription("It is a laptop");
//		product.setStatus(true);
		
//		System.out.println(product);
		
		// IOC : Inversion of control => Provide loose coupling : (DI) dependency Injection.
		// 1. Application Context container
		
		ApplicationContext context = new ClassPathXmlApplicationContext("product-bean.xml");
		Product productOne = (Product) context.getBean("product1");
		Product productTwo = context.getBean("product2", Product.class);
		System.out.println(productOne);
		System.out.println(productTwo);
		
		System.out.println("--------------------");
		
		// 2. Bean Factory Container
		Resource resource  = new ClassPathResource("product-bean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Product productA = (Product) factory.getBean("product1");
		Product productB = factory.getBean("product2", Product.class);
		System.out.println(productA);
		System.out.println(productB);
	}

}
