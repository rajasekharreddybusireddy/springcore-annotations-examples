package com.javabyrajasekhar.SpringCoreAnnotations;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.javabyrajasekhar.SpringCoreAnnotations")
public class StudentConfig {

	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Student student() {
		Student student = new Student();
//		Employee e = new Employee();
//		e.setEmpName("abc");
//		student.setEmployee(e);
//		student.setRollNo(1);
//		student.setName("rajasekhar");
//		student.setMarks(33.9);	
		student.setEmployee(employee());
		return student;
		
		
		
	}
	@Bean
	public Employee employee() {
		
		return new Employee();
	}
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Student student1() {
		Student student = new Student();
//		student.setRollNo(1);
//		student.setName("rajasekhar");
//		student.setMarks(33.9);		
		return student;
	}
}
