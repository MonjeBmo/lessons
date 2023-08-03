package lesson3;

public class mainClass {
    public static void main(String[] args) {
        // person Person = new person("Victor Manuel", "Monje Oxlaj", 20);
        // System.out.println("\nDesde el construtor");
        // Person.say();
        // Person.printData();

        person Person = new person();
        System.out.println("\nCon getters and setters\n");
        // no -> Person.name = "Victor Monje"
        Person.setName("Victor Manuel");
        Person.setLastname("Monje Oxlaj");
        Person.setAge(20);
        Person.say();
        System.out.println("view data from method");
        Person.printData();
        System.out.println("\nview data in the class main");
        System.out
                .println("DAta -> \nNombre: " + Person.getName() + " \nApellidos: " + Person.getLastname() + " \nedad: " + Person.getAge());

    }
}
