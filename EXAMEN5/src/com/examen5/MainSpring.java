package com.examen5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Profesor profesor = context.getBean("ProfesorInf", Profesor.class);
		System.out.println(profesor.getExperiencia());

	
		Profesor profesor2 = context.getBean("ProfesorMat", Profesor.class);
		System.out.println(profesor2.getExperiencia());

	
		Profesor profesor3 = context.getBean("ProfesorOr", Profesor.class);
		System.out.println(profesor3.getEmail());
		System.out.println(profesor3.getAlumnos());

		context.close();
	}

}