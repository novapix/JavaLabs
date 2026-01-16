package file_handling.qn6;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
  
	private String name;
    private float marks;

    public Student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public int getId() {
  		return id;
  	}

  	public String getName() {
  		return name;
  	}

  	public float getMarks() {
  		return marks;
  	}


    @Override
    public String toString() {
        return "Student [ID=" + id + ", Name=" + name + ", Marks=" + marks + "]";
    }
}