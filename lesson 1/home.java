package class1;

public class home {
    public static void main(String[] args) {
        Car car = new Car();

        car.setBrand("Mazda");
        car.setColor("corinto");
        car.setModel("protege");
        car.setTypeCar(1);
        car.setYear(2003);

        System.out.println("Mi carro es " + car.getBrand() + " de color " + car.getColor());
        car.start();
        car.curb();
        car.Speed();
        car.curb();

    }
}
