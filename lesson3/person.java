package lesson3;

public class person {
    String name;
    String lastname;
    int age;

    // constructor
    public person() {
    }

    public person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public void say() {
        System.out.println("Hola Humano!");
    }

    public void printData() {
        System.out.println("DAta -> \nNombre: " + this.name + " \nApellidos: " + this.lastname + " \nedad: " + this.age);
    }

}
