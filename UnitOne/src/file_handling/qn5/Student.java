package file_handling.qn5;

public class Student {
	int id;
	String name;
	int marks;

	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ID: " + id + " | Name: " + name.trim() + " | Marks: " + marks;
	}
}