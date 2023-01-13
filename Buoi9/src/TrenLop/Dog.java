package TrenLop;

public class Dog extends Animal {
	private String name;
	int k = 10;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
}
