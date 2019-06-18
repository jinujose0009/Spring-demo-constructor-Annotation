package com.jinu.learing;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach thecoach=context.getBean("trackCoach",Coach.class);
		System.out.println(thecoach.getDailyForunes());
		System.out.println(thecoach.getDailyworkout());
		context.close();

	}

}
