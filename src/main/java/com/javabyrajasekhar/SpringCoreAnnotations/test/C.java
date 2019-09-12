package com.javabyrajasekhar.SpringCoreAnnotations.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javabyrajasekhar.SpringCoreAnnotations.App;
import com.javabyrajasekhar.SpringCoreAnnotations.Student;

public class C {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext cont=new AnnotationConfigApplicationContext(App.class);
		Student student = (Student) cont.getBean("student");
		System.out.println(student.getName());
//		A a = cont.getBean(A.class);
//		System.out.println(a.getName());
//		System.out.println(a.getB());
	}

}
