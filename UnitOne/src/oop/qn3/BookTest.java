package oop.qn3;

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book(101, "Java Basics by Parakram", 499);
		b1.display();
		System.out.println("************");
		b2.display();
	}
}
