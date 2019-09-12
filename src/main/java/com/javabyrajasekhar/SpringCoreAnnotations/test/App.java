package com.javabyrajasekhar.SpringCoreAnnotations.test;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.javabyrajasekhar.SpringCoreAnnotations.Student;

@Configuration
//@ComponentScan(basePackages="com.javabyrajasekhar.SpringCoreAnnotations.test")
public class App {
@Bean("hello")
	public A hello() {	
		return new A();		
	}

@Bean
public Student student() {
	Student student = new Student();
	student.setRollNo(1);
	student.setName("rajasekhar");
	student.setMarks(33.9);		
	return student;
	
	
	
}
}
