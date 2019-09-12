package com.javabyrajasekhar.SpringCoreAnnotations;

import org.springframework.beans.factory.annotation.Value;
//@Service
public class Employee {
	@Value("100")
private Integer empId;
	@Value("rajasekhar")
private String empName;
	@Value("100.9")
private Double salary;
public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
@Value("rajasekhar")
public void setEmpName(String empName) {
	this.empName = empName;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((empId == null) ? 0 : empId.hashCode());
	result = prime * result + ((empName == null) ? 0 : empName.hashCode());
	result = prime * result + ((salary == null) ? 0 : salary.hashCode());
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
	Employee other = (Employee) obj;
	if (empId == null) {
		if (other.empId != null)
			return false;
	} else if (!empId.equals(other.empId))
		return false;
	if (empName == null) {
		if (other.empName != null)
			return false;
	} else if (!empName.equals(other.empName))
		return false;
	if (salary == null) {
		if (other.salary != null)
			return false;
	} else if (!salary.equals(other.salary))
		return false;
	return true;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}

}
