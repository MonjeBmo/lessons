package lesson2;

import java.util.Scanner;

public class mainClass {

    public static void main(String[] args) {
        operation Operation = new operation();
        Scanner scanner = new Scanner(System.in);
        // instructions
        System.out.println("Calculadora\n1-Suma\n2-Resta\n3-multiplicacion\n4-division\n5-Max o Min\nIngrese -> ");
        // var's
        int key = 0, n1 = 0, n2 = 0;
        key = scanner.nextInt();
        System.out.println("\n\nIngrese n1:");
        n1 = scanner.nextInt();
        System.out.println("\nIngrese n2:");
        n2 = scanner.nextInt();
        // result
        System.out.println("\n\nResultado -> ");
        switch (key) {
            case 1:
                System.out.println(Operation.plus(n1, n2));
                break;
            case 2:
                System.out.println(Operation.minus(n1, n2));
                break;
            case 3:
                System.out.println(Operation.multiply(n1, n2));
                break;
            case 4:
                System.out.println(Operation.div(n1, n2));
                break;
            case 5:
                System.out.println(Operation.maxOrMin(n1, n2));
                break;
            default:
                System.out.println("Error operacion erronea");
                break;
        }

        scanner.close();
    }

}
