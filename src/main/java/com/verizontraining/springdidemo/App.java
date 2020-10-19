package com.verizontraining.springdidemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		/*
		 * Book book = new Book(); book.setName("The Alchemist");
		 * book.setAuthor("Paulo Choelo"); System.out.println(book);
		 */

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/verizontraining/springdidemo/config.xml");
		Book book = (Book) ctx.getBean("book");
		System.out.println(book);
		Book book1 = (Book) ctx.getBean("book1");
		System.out.println(book1);
	}
}
