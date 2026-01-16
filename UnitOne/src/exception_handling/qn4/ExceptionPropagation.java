package exception_handling.qn4;

public class ExceptionPropagation {

	static void method3() {
		System.out.println("Inside method3()");
		int result = 10 / 0;
	}

	static void method2() throws ArithmeticException {
		System.out.println("Inside method2()");
		method3();
	}

	static void method1() {
		System.out.println("Inside method1()");
		try {
			method2();
		} catch (ArithmeticException e) {
			System.out.println("Exception handled in method1(): Division by zero");
		}
	}
}
