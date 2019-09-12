package com.javabyrajasekhar.SpringCoreAnnotations.test;

import org.springframework.beans.factory.annotation.Value;
public class A {
@Value("raja")
private String name;
private B b;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public B getB() {
	return b;
}
public void setB(B b) {
	this.b = b;
}


}
