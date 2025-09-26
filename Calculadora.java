import java.util.Scanner;

public class Calculadora {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División entre cero no permitida.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.print("Introduce el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Introduce el segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.println("\nElige una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");

            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + restar(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("Resultado: " + dividir(num1, num2));
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }

            System.out.println();

        } while (opcion != 0);

        scanner.close();
    }
}
