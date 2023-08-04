package lesson3;

public abstract class person {
	private String name;
	private String lastname;
	private int age;

	// getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// constructor
	public person() {
	}

	public person(String name, String lastname, int age) {
		this.name = name;
		this.lastname = lastname;
		this.age = age;
	}

	public abstract void say();

	public void printData() {
		System.out
				.println("DAta -> \nNombre: " + this.name + " \nApellidos: " + this.lastname + " \nedad: " + this.age);
	}

}
