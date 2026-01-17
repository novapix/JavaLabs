package multi_threading.qn7;

public class Resource {

	private String name;

	public Resource(String name) {
		this.name = name;
	}

	public void use() {
		System.out.println(Thread.currentThread().getName() + " using " + name);
	}

	public String getName() {
		return name;
	}
}