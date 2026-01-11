package oop.qn3;

public class Book {
	int id;
	String title;
	float price;

	public Book() {
		id = 1;
		title = "Wuthering Heights";
		price = 1000;
	}

	public Book(int id, String title, float price) {
		this.id = id;
		this.title = title;
		this.price = price;
	}
	void display() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}
