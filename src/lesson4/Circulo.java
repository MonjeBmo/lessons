package lesson4;

public class Circulo implements figura, Figura2D {
    //   Atributos
    private double radio;

    //Cosntructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    //Metodos
    @Override
    public double calcularArea() {
        return Math.PI * (this.radio * this.radio);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    @Override
    public void imprimirDescripcion() {
        System.out.println("Es un circulo");
    }
}
