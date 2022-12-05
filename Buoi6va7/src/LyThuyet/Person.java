package LyThuyet;

public class Person {
	private String name;
	private int age;
	private String address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person(String name, int age, String address) {
		this(); //dung de goi construcotr khong doi, chi goi trong constructor co doi
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//khoi tao ve mac dinh gia tri cua cac thuoc tinh
	public Person() {
		System.out.println("goi constructor khong doi mac dinh doi tuong");
	}
	
	public void output() {
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Address: " + getAddress());
	}
	
	public void an() {
		System.out.println("An com da nhooo");
	}
	
	public void diHoc() {
		this.an();
		System.out.println("Di hoc day nhooo");
	}
	public static void main(String[] args) {
		Person person = new Person("Nguyen Van A", 20, "Ha Noi");
		person.output();
		person.diHoc();
	}
}
