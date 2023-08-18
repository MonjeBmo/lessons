package lesson4;

public class classMain {
    public static void main(String[] args) {
        figura circulo = new Circulo(3);
        System.out.println("Area : " + circulo.calcularArea());
        System.out.println("Perimetro : " + circulo.calcularPerimetro());
        ((Figura2D) circulo).imprimirDescripcion();
    }

}
