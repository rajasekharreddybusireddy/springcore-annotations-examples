package com.javabyrajasekhar.SpringCoreAnnotations.test;

import org.springframework.beans.factory.annotation.Value;

public class B {
	@Value("hyderabad")
private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "B [address=" + address + "]";
	}
	
}
