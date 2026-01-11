package oop.qn2;

public class Manager extends Employee {
	double bonus=10000;
	
	@Override
	double calculateSalary() {
		return salary + bonus;
	}
	
}
