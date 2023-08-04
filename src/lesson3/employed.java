package lesson3;

// this is the practice of lesson 4
// use extends (inheritance)
public class employed extends person {

//	attributes 	
	private String position;
	private double salary;

//	getter's and setter's	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

//	constructor
	public employed(String name, String lastname, int age, String position, double salary) {
		// class father
		super(name, lastname, age);
		// this class
		this.position = position;
		this.salary = salary;
	}

//	methods

	public void viewSalary() {
		System.out.println("El salario de " + super.getName() + " " + super.getLastname() + " es : " + getSalary());
	}

	@Override
	public void say() {
		System.out.println(
				"\nHola humano , " + super.getName() + " " + super.getLastname() + " Tu puesto es de " + getPosition());
	}

	@Override
	public void printData() {
		System.out.println("DAta -> \nNombre: " + super.getName() + " \nApellidos: " + super.getLastname() + " \nedad: "
				+ super.getAge() + " \npuesto: " + getPosition() + " \nSalario: " + getSalary());
	}

}
