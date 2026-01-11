package oop.qn4;

public class ShapeTest {
	public static void main(String[] args) {
		Shape s1 = new Rectangle(10, 5);
		Shape s2 = new Circle(7);

		System.out.println("Rectangle Area: " + s1.area());
		System.out.println("Circle Area: " + s2.area());
	}
}
