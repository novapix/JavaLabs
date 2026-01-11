package oop.qn1;

public class Student {
	private int id;
	private String name;
	private int marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		 if (marks >= 0 && marks <= 100) {
	            this.marks = marks;
	        } else {
	            System.out.println("Invalid marks! Must be between 0 and 100.");
	            this.marks = 0;
	        }
	}
	
	
}
