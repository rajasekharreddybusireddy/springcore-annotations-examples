package com.javabyrajasekhar.SpringCoreAnnotations.test;

public class Student {
private Integer rollNo;
private String name;
private Double marks;
public Integer getRollNo() {
	return rollNo;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((marks == null) ? 0 : marks.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((rollNo == null) ? 0 : rollNo.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (marks == null) {
		if (other.marks != null)
			return false;
	} else if (!marks.equals(other.marks))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (rollNo == null) {
		if (other.rollNo != null)
			return false;
	} else if (!rollNo.equals(other.rollNo))
		return false;
	return true;
}

public void setRollNo(Integer rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getMarks() {
	return marks;
}
public void setMarks(Double marks) {
	this.marks = marks;
}

}
