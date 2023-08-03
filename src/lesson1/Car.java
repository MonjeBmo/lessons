package lesson1;

public class Car {
    // Atributos -> variables de instancia
    private String brand; // -> marca
    private String model;
    private String color;
    private int TypeCar;
    private int year;
    
    // Metodos
    public void start(){
        System.out.println("Arranco");
    }

    public void Speed(){
        System.out.println("El carro acelera!");
    }

    // frenar -> curb
    public void curb(){
        System.out.println("Freno");
    }

    // encapsulamiento

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTypeCar() {
        return TypeCar;
    }

    public void setTypeCar(int typeCar) {
        TypeCar = typeCar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // construstor
    public Car() {
    }

}
