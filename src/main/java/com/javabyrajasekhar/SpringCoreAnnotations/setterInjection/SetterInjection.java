package com.javabyrajasekhar.SpringCoreAnnotations.setterInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javabyrajasekhar.SpringCoreAnnotations.Employee;
import com.javabyrajasekhar.SpringCoreAnnotations.Student;
import com.javabyrajasekhar.SpringCoreAnnotations.StudentConfig;

public class SetterInjection {

	public static void main(String[] args) {
		//AnnotationConfigApplicationContext container =new AnnotationConfigApplicationContext(StudentConfig.class);
		BeanFactory container =new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student = (Student) container.getBean("student");
//		student.setRollNo(1);
//		student.setName("rajasekhar");
//		student.setMarks(33.9);	
		System.out.println(student.hashCode());
		System.out.println("rollno :-"+student.getRollNo());
		System.out.println("name :-"+student.getName());
		System.out.println("marks :-"+student.getMarks());
		//Employee employee = container.getBean(Employee.class);
		//System.out.println(employee);
		System.out.println(student.getEmployee());
//		Student student2 = (Student) container.getBean("student1");
//		System.out.println("=============================================");
//		System.out.println(student2.hashCode());
//		System.out.println("rollno :-"+student2.getRollNo());
//		System.out.println("name :-"+student2.getName());
//		System.out.println("marks :-"+student2.getMarks());
//		
	//container.close();
	}

}
