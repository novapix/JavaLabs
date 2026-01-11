package oop.qn1;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(1);
		s.setName("Parakram");
		s.setMarks(95);
		
	    System.out.println("Student Details");
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
	}
}
