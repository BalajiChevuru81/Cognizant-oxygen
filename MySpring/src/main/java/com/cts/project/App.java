package com.cts.project;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Spring-Module.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
	}
}
