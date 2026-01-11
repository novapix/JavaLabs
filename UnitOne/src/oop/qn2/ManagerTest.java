package oop.qn2;

public class ManagerTest {
	public static void main(String[] args) {
		Employee e = new Manager();
		System.out.println("Total Salary: " + e.calculateSalary());
	}
}
