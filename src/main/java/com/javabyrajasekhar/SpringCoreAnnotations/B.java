package com.javabyrajasekhar.SpringCoreAnnotations;

import java.io.IOException;

public class B extends A {
@Override
public void m1() throws RuntimeException {
	System.out.println(10/0);
}
}
