package edu.task.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		String springConfig = "edu/task/job/config/applicationConfig.xml";

		System.out.println("Invoking scheduler...");
		new ClassPathXmlApplicationContext(springConfig);
	}
}